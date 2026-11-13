import java.util.List;

/**
 * Abstract syntax tree of a Tiny program.
 * Every node knows its position (line, col) so that the semantic analysis
 * can report meaningful errors. Columns are 0-based, like in the scanner output.
 */
public final class Ast {
    private Ast() {}

    public sealed interface Node {
        int line();
        int col();
    }

    // ---------- program and declarations ----------
    public record Program(int line, int col, List<Decl> decls) implements Node {}

    public sealed interface Decl extends Node {}

    public record FunDecl(int line, int col, Type returnType, String name,
                          List<Param> params, Block body) implements Decl {}

    public record VarDecl(int line, int col, Type type, String name) implements Decl {}

    public record Param(int line, int col, Type type, String name) implements Node {}

    // ---------- types ----------
    public sealed interface Type extends Node {}

    public enum Prim { INT, CHAR }

    public record PrimType(int line, int col, Prim kind) implements Type {}

    /** int[10][2] is ArrayType(ArrayType(int, 10), 2), i.e. "an array of 2 arrays of 10 integers". */
    public record ArrayType(int line, int col, Type elem, Exp size) implements Type {}

    // ---------- statements ----------
    public sealed interface Stmt extends Node {}

    public record Block(int line, int col, List<VarDecl> vars, List<Stmt> stmts) implements Stmt {}

    /** elseBranch is null when there is no else. */
    public record If(int line, int col, Exp cond, Stmt thenBranch, Stmt elseBranch) implements Stmt {}

    public record While(int line, int col, Exp cond, Stmt body) implements Stmt {}

    public record Assign(int line, int col, LExp target, Exp value) implements Stmt {}

    public record Return(int line, int col, Exp value) implements Stmt {}

    public record CallStmt(int line, int col, String name, List<Exp> args) implements Stmt {}

    public record Write(int line, int col, Exp value) implements Stmt {}

    public record Read(int line, int col, LExp target) implements Stmt {}

    // ---------- expressions ----------
    public sealed interface Exp extends Node {}

    /** Expressions that can be assigned to / read into: variables and array elements. */
    public sealed interface LExp extends Exp {}

    public record VarRef(int line, int col, String name) implements LExp {}

    public record ArrayAccess(int line, int col, LExp array, Exp index) implements LExp {}

    public record NumberLit(int line, int col, int value) implements Exp {}

    public record CharLit(int line, int col, char value) implements Exp {}

    public record Call(int line, int col, String name, List<Exp> args) implements Exp {}

    public record Length(int line, int col, LExp array) implements Exp {}

    public enum Op {
        PLUS("+"), MINUS("-"), TIMES("*"), DIVIDE("/"),
        EQUAL("=="), NEQUAL("!="), GREATER(">"), LESS("<"), NOT("!");

        public final String symbol;
        Op(String symbol) { this.symbol = symbol; }
    }

    /** line/col point to the operator token. */
    public record Binary(int line, int col, Op op, Exp left, Exp right) implements Exp {}

    public record Unary(int line, int col, Op op, Exp operand) implements Exp {}
}
