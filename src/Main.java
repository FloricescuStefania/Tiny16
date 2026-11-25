import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "test_syntax_error.tiny";
        boolean showParseTree = false;
        for (String arg : args) {
            if (arg.equals("--tree")) showParseTree = true;
            else fileName = arg;
        }

        try {
            // ================= PHASE 1: SCANNING =================
            CharStream input = CharStreams.fromFileName(fileName);
            CTinyLexer lexer = new CTinyLexer(input);

            System.out.println("SCANNING");

            Token token;
            int errorCount = 0;

            while ((token = lexer.nextToken()).getType() != Token.EOF) {
                String ruleName = CTinyLexer.VOCABULARY.getSymbolicName(token.getType());

                if ("LEX_ERROR".equals(ruleName)) {
                    errorCount++;
                    System.err.printf("[LEXICAL ERROR] Invalid character '%s' at line %d, column %d\n",
                            token.getText(), token.getLine(), token.getCharPositionInLine());
                } else {
                    System.out.printf("Line %-3d | Col %-3d | Token: %-12s | Text: '%s'\n",
                            token.getLine(),
                            token.getCharPositionInLine(),
                            ruleName,
                            token.getText());
                }
            }

            if (errorCount == 0) {
                System.out.println("Lexical analysis completed SUCCESSFULLY.");
            } else {
                System.out.println("The lexical analysis ended with " + errorCount + " errors.");
                System.out.println("PARSING skipped because of lexical errors.");
                System.exit(1);
            }

            // ================= PHASE 2: PARSING =================
            System.out.println();
            System.out.println("PARSING");

            CTinyLexer parserLexer = new CTinyLexer(CharStreams.fromFileName(fileName));
            parserLexer.removeErrorListeners();
            CTinyParser parser = new CTinyParser(new CommonTokenStream(parserLexer));

            SyntaxErrorListener errorListener = new SyntaxErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            CTinyParser.ProgramContext tree = parser.program();

            if (errorListener.count() > 0) {
                System.out.println("The parsing ended with " + errorListener.count() + " syntax error(s).");
                System.exit(1);
            }
            System.out.println("Parsing completed SUCCESSFULLY.");

            if (showParseTree) {
                System.out.println();
                System.out.println("PARSE TREE");
                System.out.println(tree.toStringTree(parser));
            }

            // ================= PARSE TREE WALK (LISTENER) =================
            System.out.println();
            System.out.println("LISTENER");
            ParseTreeWalker.DEFAULT.walk(new TinyListener(), tree);

            // ================= ABSTRACT SYNTAX TREE =================
            AstBuilder builder = new AstBuilder();
            Ast.Program ast = (Ast.Program) builder.visit(tree);

            if (!builder.errors().isEmpty()) {
                builder.errors().forEach(System.err::println);
                System.out.println("The AST construction ended with " + builder.errors().size() + " error(s).");
                System.exit(1);
            }

            System.out.println();
            System.out.println("ABSTRACT SYNTAX TREE");
            System.out.print(AstPrinter.print(ast));

        } catch (IOException e) {
            System.err.println("The file could not be opened: " + e.getMessage());
            System.exit(1);
        }
    }
}