import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

/** Walks the ANTLR parse tree and builds the AST (the "actions" of the parser). */
public class AstBuilder extends CTinyBaseVisitor<Ast.Node> {

    private final List<String> errors = new ArrayList<>();

    /** Problems found while building the AST (e.g. an integer literal that is too large). */
    public List<String> errors() {
        return errors;
    }

    // ---------- helpers ----------
    private static int line(ParserRuleContext c) { return c.getStart().getLine(); }
    private static int col(ParserRuleContext c)  { return c.getStart().getCharPositionInLine(); }

    private Ast.Exp exp(CTinyParser.ExpContext c)       { return (Ast.Exp) visit(c); }
    private Ast.LExp lexp(CTinyParser.LexpContext c)    { return (Ast.LExp) visit(c); }
    private Ast.Stmt stmt(CTinyParser.StatementContext c) { return (Ast.Stmt) visit(c); }
    private Ast.Type type(CTinyParser.TypeContext c)    { return (Ast.Type) visit(c); }

    private List<Ast.Exp> args(CTinyParser.ParsContext c) {
        List<Ast.Exp> list = new ArrayList<>();
        for (CTinyParser.ExpContext e : c.exp()) list.add(exp(e));
        return list;
    }

    private static Ast.Op opOf(Token t) {
        return switch (t.getType()) {
            case CTinyParser.PLUS    -> Ast.Op.PLUS;
            case CTinyParser.MINUS   -> Ast.Op.MINUS;
            case CTinyParser.TIMES   -> Ast.Op.TIMES;
            case CTinyParser.DIVIDE  -> Ast.Op.DIVIDE;
            case CTinyParser.EQUAL   -> Ast.Op.EQUAL;
            case CTinyParser.NEQUAL  -> Ast.Op.NEQUAL;
            case CTinyParser.GREATER -> Ast.Op.GREATER;
            case CTinyParser.LESS    -> Ast.Op.LESS;
            case CTinyParser.NOT     -> Ast.Op.NOT;
            default -> throw new IllegalStateException("Not an operator: " + t.getText());
        };
    }

    private Ast.Exp binary(Token op, CTinyParser.ExpContext l, CTinyParser.ExpContext r) {
        return new Ast.Binary(op.getLine(), op.getCharPositionInLine(), opOf(op), exp(l), exp(r));
    }

    // ---------- program and declarations ----------
    @Override
    public Ast.Node visitProgram(CTinyParser.ProgramContext ctx) {
        List<Ast.Decl> decls = new ArrayList<>();
        for (CTinyParser.DeclarationContext d : ctx.declaration()) decls.add((Ast.Decl) visit(d));
        return new Ast.Program(line(ctx), col(ctx), decls);
    }

    @Override
    public Ast.Node visitDeclaration(CTinyParser.DeclarationContext ctx) {
        return ctx.funDeclaration() != null ? visit(ctx.funDeclaration()) : visit(ctx.varDeclaration());
    }

    @Override
    public Ast.Node visitFunDeclaration(CTinyParser.FunDeclarationContext ctx) {
        List<Ast.Param> params = new ArrayList<>();
        for (CTinyParser.FormalParContext p : ctx.formalPars().formalPar()) params.add((Ast.Param) visit(p));
        return new Ast.FunDecl(line(ctx), col(ctx), type(ctx.type()), ctx.NAME().getText(),
                params, (Ast.Block) visit(ctx.block()));
    }

    @Override
    public Ast.Node visitFormalPar(CTinyParser.FormalParContext ctx) {
        return new Ast.Param(line(ctx), col(ctx), type(ctx.type()), ctx.NAME().getText());
    }

    @Override
    public Ast.Node visitVarDeclaration(CTinyParser.VarDeclarationContext ctx) {
        return new Ast.VarDecl(line(ctx), col(ctx), type(ctx.type()), ctx.NAME().getText());
    }

    // ---------- types ----------
    @Override
    public Ast.Node visitIntType(CTinyParser.IntTypeContext ctx) {
        return new Ast.PrimType(line(ctx), col(ctx), Ast.Prim.INT);
    }

    @Override
    public Ast.Node visitCharType(CTinyParser.CharTypeContext ctx) {
        return new Ast.PrimType(line(ctx), col(ctx), Ast.Prim.CHAR);
    }

    @Override
    public Ast.Node visitArrayType(CTinyParser.ArrayTypeContext ctx) {
        return new Ast.ArrayType(line(ctx), col(ctx), type(ctx.type()), exp(ctx.exp()));
    }

    // ---------- statements ----------
    @Override
    public Ast.Node visitBlock(CTinyParser.BlockContext ctx) {
        List<Ast.VarDecl> vars = new ArrayList<>();
        for (CTinyParser.VarDeclarationContext v : ctx.varDeclaration()) vars.add((Ast.VarDecl) visit(v));
        List<Ast.Stmt> stmts = new ArrayList<>();
        for (CTinyParser.StatementContext s : ctx.statements().statement()) stmts.add(stmt(s));
        return new Ast.Block(line(ctx), col(ctx), vars, stmts);
    }

    @Override
    public Ast.Node visitIfStmt(CTinyParser.IfStmtContext ctx) {
        Ast.Stmt thenBranch = stmt(ctx.statement(0));
        Ast.Stmt elseBranch = ctx.ELSE() != null ? stmt(ctx.statement(1)) : null;
        return new Ast.If(line(ctx), col(ctx), exp(ctx.exp()), thenBranch, elseBranch);
    }

    @Override
    public Ast.Node visitWhileStmt(CTinyParser.WhileStmtContext ctx) {
        return new Ast.While(line(ctx), col(ctx), exp(ctx.exp()), stmt(ctx.statement()));
    }

    @Override
    public Ast.Node visitAssignStmt(CTinyParser.AssignStmtContext ctx) {
        return new Ast.Assign(line(ctx), col(ctx), lexp(ctx.lexp()), exp(ctx.exp()));
    }

    @Override
    public Ast.Node visitReturnStmt(CTinyParser.ReturnStmtContext ctx) {
        return new Ast.Return(line(ctx), col(ctx), exp(ctx.exp()));
    }

    @Override
    public Ast.Node visitCallStmt(CTinyParser.CallStmtContext ctx) {
        return new Ast.CallStmt(line(ctx), col(ctx), ctx.NAME().getText(), args(ctx.pars()));
    }

    @Override
    public Ast.Node visitBlockStmt(CTinyParser.BlockStmtContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public Ast.Node visitWriteStmt(CTinyParser.WriteStmtContext ctx) {
        return new Ast.Write(line(ctx), col(ctx), exp(ctx.exp()));
    }

    @Override
    public Ast.Node visitReadStmt(CTinyParser.ReadStmtContext ctx) {
        return new Ast.Read(line(ctx), col(ctx), lexp(ctx.lexp()));
    }

    // ---------- left-expressions ----------
    @Override
    public Ast.Node visitVarAccess(CTinyParser.VarAccessContext ctx) {
        return new Ast.VarRef(line(ctx), col(ctx), ctx.NAME().getText());
    }

    @Override
    public Ast.Node visitArrayAccess(CTinyParser.ArrayAccessContext ctx) {
        return new Ast.ArrayAccess(line(ctx), col(ctx), lexp(ctx.lexp()), exp(ctx.exp()));
    }

    // ---------- expressions ----------
    @Override
    public Ast.Node visitLexpExp(CTinyParser.LexpExpContext ctx) {
        return visit(ctx.lexp());
    }

    @Override
    public Ast.Node visitNumberExp(CTinyParser.NumberExpContext ctx) {
        String text = ctx.NUMBER().getText();
        int value = 0;
        try {
            value = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            errors.add(String.format("[ERROR] line %d, column %d: integer literal '%s' is too large",
                    line(ctx), col(ctx), text));
        }
        return new Ast.NumberLit(line(ctx), col(ctx), value);
    }

    @Override
    public Ast.Node visitCharExp(CTinyParser.CharExpContext ctx) {
        String text = ctx.QCHAR().getText();           // e.g. 'a' or '\n'
        String body = text.substring(1, text.length() - 1);
        char value = body.charAt(0);
        if (body.length() == 2 && body.charAt(0) == '\\') {
            value = switch (body.charAt(1)) {
                case 'n' -> '\n';
                case 't' -> '\t';
                case 'r' -> '\r';
                default  -> body.charAt(1);            // \\  \'  \"
            };
        }
        return new Ast.CharLit(line(ctx), col(ctx), value);
    }

    @Override
    public Ast.Node visitCallExp(CTinyParser.CallExpContext ctx) {
        return new Ast.Call(line(ctx), col(ctx), ctx.NAME().getText(), args(ctx.pars()));
    }

    @Override
    public Ast.Node visitLengthExp(CTinyParser.LengthExpContext ctx) {
        return new Ast.Length(line(ctx), col(ctx), lexp(ctx.lexp()));
    }

    @Override
    public Ast.Node visitParenExp(CTinyParser.ParenExpContext ctx) {
        return visit(ctx.exp());                       // parentheses are not kept in the AST
    }

    @Override
    public Ast.Node visitUnaryExp(CTinyParser.UnaryExpContext ctx) {
        return new Ast.Unary(ctx.op.getLine(), ctx.op.getCharPositionInLine(), opOf(ctx.op), exp(ctx.exp()));
    }

    @Override
    public Ast.Node visitMulExp(CTinyParser.MulExpContext ctx) {
        return binary(ctx.op, ctx.exp(0), ctx.exp(1));
    }

    @Override
    public Ast.Node visitAddExp(CTinyParser.AddExpContext ctx) {
        return binary(ctx.op, ctx.exp(0), ctx.exp(1));
    }

    @Override
    public Ast.Node visitRelExp(CTinyParser.RelExpContext ctx) {
        return binary(ctx.op, ctx.exp(0), ctx.exp(1));
    }

    @Override
    public Ast.Node visitEqExp(CTinyParser.EqExpContext ctx) {
        return binary(ctx.op, ctx.exp(0), ctx.exp(1));
    }
}
