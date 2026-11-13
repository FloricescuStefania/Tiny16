import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/** Collects and prints syntax errors reported by the parser. */
public class SyntaxErrorListener extends BaseErrorListener {

    private int count = 0;

    public int count() {
        return count;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg, RecognitionException e) {
        count++;
        System.err.printf("[SYNTAX ERROR] line %d, column %d: %s%n", line, charPositionInLine, msg);
    }
}
