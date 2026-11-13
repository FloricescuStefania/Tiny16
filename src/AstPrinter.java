import java.util.stream.Collectors;

/**
 * Prints the AST as an indented tree. Expressions are printed on one line and fully
 * parenthesised, so operator precedence and associativity can be checked at a glance.
 */
public class AstPrinter {

    private final StringBuilder sb = new StringBuilder();

    public static String print(Ast.Node root) {
        AstPrinter p = new AstPrinter();
        p.node(root, 0);
        return p.sb.toString();
    }

    private void line(int depth, String text) {
        sb.append("  ".repeat(depth)).append(text).append('\n');
    }

    private void node(Ast.Node n, int d) {
        switch (n) {
            case Ast.Program p -> {
                line(d, "Program");
                p.decls().forEach(x -> node(x, d + 1));
            }
            case Ast.FunDecl f -> {
                String params = f.params().stream()
                        .map(p -> type(p.type()) + " " + p.name())
                        .collect(Collectors.joining(", "));
                line(d, "FunDecl " + f.name() + "(" + params + ") : " + type(f.returnType()) + pos(f));
                node(f.body(), d + 1);
            }
            case Ast.VarDecl v -> line(d, "VarDecl " + v.name() + " : " + type(v.type()) + pos(v));
            case Ast.Param p -> line(d, "Param " + p.name() + " : " + type(p.type()));
            case Ast.Block b -> {
                line(d, "Block" + pos(b));
                b.vars().forEach(x -> node(x, d + 1));
                b.stmts().forEach(x -> node(x, d + 1));
            }
            case Ast.If i -> {
                line(d, "If " + exp(i.cond()) + pos(i));
                line(d + 1, "then");
                node(i.thenBranch(), d + 2);
                if (i.elseBranch() != null) {
                    line(d + 1, "else");
                    node(i.elseBranch(), d + 2);
                }
            }
            case Ast.While w -> {
                line(d, "While " + exp(w.cond()) + pos(w));
                node(w.body(), d + 1);
            }
            case Ast.Assign a -> line(d, "Assign " + exp(a.target()) + " = " + exp(a.value()) + pos(a));
            case Ast.Return r -> line(d, "Return " + exp(r.value()) + pos(r));
            case Ast.CallStmt c -> line(d, "CallStmt " + exp(new Ast.Call(c.line(), c.col(), c.name(), c.args())) + pos(c));
            case Ast.Write w -> line(d, "Write " + exp(w.value()) + pos(w));
            case Ast.Read r -> line(d, "Read " + exp(r.target()) + pos(r));
            case Ast.Type t -> line(d, type(t));
            case Ast.Exp e -> line(d, exp(e));
        }
    }

    private static String pos(Ast.Node n) {
        return "   (" + n.line() + ":" + n.col() + ")";
    }

    /** int[10][2] is shown as int[10][2]. */
    static String type(Ast.Type t) {
        return switch (t) {
            case Ast.PrimType p -> p.kind() == Ast.Prim.INT ? "int" : "char";
            case Ast.ArrayType a -> type(a.elem()) + "[" + exp(a.size()) + "]";
        };
    }

    static String exp(Ast.Exp e) {
        return switch (e) {
            case Ast.VarRef v -> v.name();
            case Ast.ArrayAccess a -> exp(a.array()) + "[" + exp(a.index()) + "]";
            case Ast.NumberLit n -> String.valueOf(n.value());
            case Ast.CharLit c -> "'" + charText(c.value()) + "'";
            case Ast.Call c -> c.name() + "(" + c.args().stream().map(AstPrinter::exp)
                    .collect(Collectors.joining(", ")) + ")";
            case Ast.Length l -> "length " + exp(l.array());
            case Ast.Binary b -> "(" + exp(b.left()) + " " + b.op().symbol + " " + exp(b.right()) + ")";
            case Ast.Unary u -> "(" + u.op().symbol + exp(u.operand()) + ")";
        };
    }

    private static String charText(char c) {
        return switch (c) {
            case '\n' -> "\\n";
            case '\t' -> "\\t";
            case '\r' -> "\\r";
            case '\'' -> "\\'";
            case '\\' -> "\\\\";
            default -> String.valueOf(c);
        };
    }
}
