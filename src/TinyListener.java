import org.antlr.v4.runtime.tree.ErrorNode;

/**
 * Listener for the CTiny parser.
 *
 * It is meant to be used with a ParseTreeWalker. Every enterXxx / exitXxx
 * method that corresponds to a grammar rule (or to a labeled alternative)
 * prints an appropriate message on the screen. The messages are indented
 * according to the depth of the node in the parse tree, so the output
 * reflects the structure of the parsed program.
 */
public class TinyListener extends CTinyBaseListener {

    /** Current depth in the parse tree (used for indentation). */
    private int depth = 0;

    private void enter(String what) {
        System.out.println(indent() + "-> Entering " + what);
        depth++;
    }

    private void exit(String what) {
        depth--;
        System.out.println(indent() + "<- Exiting  " + what);
    }

    private String indent() {
        return "  ".repeat(depth);
    }

    @Override
    public void enterProgram(CTinyParser.ProgramContext ctx) {
        enter("program");
    }

    @Override
    public void exitProgram(CTinyParser.ProgramContext ctx) {
        exit("program");
    }

    @Override
    public void enterDeclaration(CTinyParser.DeclarationContext ctx) {
        enter("declaration");
    }

    @Override
    public void exitDeclaration(CTinyParser.DeclarationContext ctx) {
        exit("declaration");
    }

    @Override
    public void enterFunDeclaration(CTinyParser.FunDeclarationContext ctx) {
        enter("function declaration " + quote(ctx.NAME().getText()));
    }

    @Override
    public void exitFunDeclaration(CTinyParser.FunDeclarationContext ctx) {
        exit("function declaration " + quote(ctx.NAME().getText()));
    }

    @Override
    public void enterFormalPars(CTinyParser.FormalParsContext ctx) {
        enter("formal parameters list");
    }

    @Override
    public void exitFormalPars(CTinyParser.FormalParsContext ctx) {
        exit("formal parameters list");
    }

    @Override
    public void enterFormalPar(CTinyParser.FormalParContext ctx) {
        enter("formal parameter " + quote(ctx.NAME().getText()));
    }

    @Override
    public void exitFormalPar(CTinyParser.FormalParContext ctx) {
        exit("formal parameter " + quote(ctx.NAME().getText()));
    }

    @Override
    public void enterBlock(CTinyParser.BlockContext ctx) {
        enter("block");
    }

    @Override
    public void exitBlock(CTinyParser.BlockContext ctx) {
        exit("block");
    }

    @Override
    public void enterVarDeclaration(CTinyParser.VarDeclarationContext ctx) {
        enter("variable declaration " + quote(ctx.NAME().getText()));
    }

    @Override
    public void exitVarDeclaration(CTinyParser.VarDeclarationContext ctx) {
        exit("variable declaration " + quote(ctx.NAME().getText()));
    }

    @Override
    public void enterArrayType(CTinyParser.ArrayTypeContext ctx) {
        enter("array type");
    }

    @Override
    public void exitArrayType(CTinyParser.ArrayTypeContext ctx) {
        exit("array type");
    }

    @Override
    public void enterCharType(CTinyParser.CharTypeContext ctx) {
        enter("type 'char'");
    }

    @Override
    public void exitCharType(CTinyParser.CharTypeContext ctx) {
        exit("type 'char'");
    }

    @Override
    public void enterIntType(CTinyParser.IntTypeContext ctx) {
        enter("type 'int'");
    }

    @Override
    public void exitIntType(CTinyParser.IntTypeContext ctx) {
        exit("type 'int'");
    }

    @Override
    public void enterStatements(CTinyParser.StatementsContext ctx) {
        enter("statements list");
    }

    @Override
    public void exitStatements(CTinyParser.StatementsContext ctx) {
        exit("statements list");
    }

    @Override
    public void enterIfStmt(CTinyParser.IfStmtContext ctx) {
        enter("'if' statement");
    }

    @Override
    public void exitIfStmt(CTinyParser.IfStmtContext ctx) {
        exit("'if' statement");
    }

    @Override
    public void enterWhileStmt(CTinyParser.WhileStmtContext ctx) {
        enter("'while' statement");
    }

    @Override
    public void exitWhileStmt(CTinyParser.WhileStmtContext ctx) {
        exit("'while' statement");
    }

    @Override
    public void enterAssignStmt(CTinyParser.AssignStmtContext ctx) {
        enter("assignment statement");
    }

    @Override
    public void exitAssignStmt(CTinyParser.AssignStmtContext ctx) {
        exit("assignment statement");
    }

    @Override
    public void enterReturnStmt(CTinyParser.ReturnStmtContext ctx) {
        enter("'return' statement");
    }

    @Override
    public void exitReturnStmt(CTinyParser.ReturnStmtContext ctx) {
        exit("'return' statement");
    }

    @Override
    public void enterCallStmt(CTinyParser.CallStmtContext ctx) {
        enter("function call statement " + quote(ctx.NAME().getText()));
    }

    @Override
    public void exitCallStmt(CTinyParser.CallStmtContext ctx) {
        exit("function call statement " + quote(ctx.NAME().getText()));
    }

    @Override
    public void enterBlockStmt(CTinyParser.BlockStmtContext ctx) {
        enter("block statement");
    }

    @Override
    public void exitBlockStmt(CTinyParser.BlockStmtContext ctx) {
        exit("block statement");
    }

    @Override
    public void enterWriteStmt(CTinyParser.WriteStmtContext ctx) {
        enter("'write' statement");
    }

    @Override
    public void exitWriteStmt(CTinyParser.WriteStmtContext ctx) {
        exit("'write' statement");
    }

    @Override
    public void enterReadStmt(CTinyParser.ReadStmtContext ctx) {
        enter("'read' statement");
    }

    @Override
    public void exitReadStmt(CTinyParser.ReadStmtContext ctx) {
        exit("'read' statement");
    }

    @Override
    public void enterArrayAccess(CTinyParser.ArrayAccessContext ctx) {
        enter("array access");
    }

    @Override
    public void exitArrayAccess(CTinyParser.ArrayAccessContext ctx) {
        exit("array access");
    }

    @Override
    public void enterVarAccess(CTinyParser.VarAccessContext ctx) {
        enter("variable access " + quote(ctx.NAME().getText()));
    }

    @Override
    public void exitVarAccess(CTinyParser.VarAccessContext ctx) {
        exit("variable access " + quote(ctx.NAME().getText()));
    }

    @Override
    public void enterMulExp(CTinyParser.MulExpContext ctx) {
        enter("multiplicative expression " + quote(ctx.op.getText()));
    }

    @Override
    public void exitMulExp(CTinyParser.MulExpContext ctx) {
        exit("multiplicative expression " + quote(ctx.op.getText()));
    }

    @Override
    public void enterEqExp(CTinyParser.EqExpContext ctx) {
        enter("equality expression " + quote(ctx.op.getText()));
    }

    @Override
    public void exitEqExp(CTinyParser.EqExpContext ctx) {
        exit("equality expression " + quote(ctx.op.getText()));
    }

    @Override
    public void enterCharExp(CTinyParser.CharExpContext ctx) {
        enter("character literal " + ctx.QCHAR().getText());
    }

    @Override
    public void exitCharExp(CTinyParser.CharExpContext ctx) {
        exit("character literal " + ctx.QCHAR().getText());
    }

    @Override
    public void enterCallExp(CTinyParser.CallExpContext ctx) {
        enter("function call expression " + quote(ctx.NAME().getText()));
    }

    @Override
    public void exitCallExp(CTinyParser.CallExpContext ctx) {
        exit("function call expression " + quote(ctx.NAME().getText()));
    }

    @Override
    public void enterParenExp(CTinyParser.ParenExpContext ctx) {
        enter("parenthesized expression");
    }

    @Override
    public void exitParenExp(CTinyParser.ParenExpContext ctx) {
        exit("parenthesized expression");
    }

    @Override
    public void enterAddExp(CTinyParser.AddExpContext ctx) {
        enter("additive expression " + quote(ctx.op.getText()));
    }

    @Override
    public void exitAddExp(CTinyParser.AddExpContext ctx) {
        exit("additive expression " + quote(ctx.op.getText()));
    }

    @Override
    public void enterRelExp(CTinyParser.RelExpContext ctx) {
        enter("relational expression " + quote(ctx.op.getText()));
    }

    @Override
    public void exitRelExp(CTinyParser.RelExpContext ctx) {
        exit("relational expression " + quote(ctx.op.getText()));
    }

    @Override
    public void enterUnaryExp(CTinyParser.UnaryExpContext ctx) {
        enter("unary expression " + quote(ctx.op.getText()));
    }

    @Override
    public void exitUnaryExp(CTinyParser.UnaryExpContext ctx) {
        exit("unary expression " + quote(ctx.op.getText()));
    }

    @Override
    public void enterLengthExp(CTinyParser.LengthExpContext ctx) {
        enter("'length' expression");
    }

    @Override
    public void exitLengthExp(CTinyParser.LengthExpContext ctx) {
        exit("'length' expression");
    }

    @Override
    public void enterNumberExp(CTinyParser.NumberExpContext ctx) {
        enter("number literal " + quote(ctx.NUMBER().getText()));
    }

    @Override
    public void exitNumberExp(CTinyParser.NumberExpContext ctx) {
        exit("number literal " + quote(ctx.NUMBER().getText()));
    }

    @Override
    public void enterLexpExp(CTinyParser.LexpExpContext ctx) {
        enter("l-value expression");
    }

    @Override
    public void exitLexpExp(CTinyParser.LexpExpContext ctx) {
        exit("l-value expression");
    }

    @Override
    public void enterPars(CTinyParser.ParsContext ctx) {
        enter("actual parameters list");
    }

    @Override
    public void exitPars(CTinyParser.ParsContext ctx) {
        exit("actual parameters list");
    }

    /** Called by the walker when the tree contains a node created during error recovery. */
    @Override
    public void visitErrorNode(ErrorNode node) {
        System.out.println(indent() + "!! Error node: '" + node.getText() + "'");
    }

    private static String quote(String s) {
        return "'" + s + "'";
    }
}