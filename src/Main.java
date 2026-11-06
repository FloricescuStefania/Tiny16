import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "test.tiny";
        if (args.length > 0) {
            fileName = args[0];
        }

        try {
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
            }

        } catch (IOException e) {
            System.err.println("The file could not be oppened: " + e.getMessage());
        }
    }
}