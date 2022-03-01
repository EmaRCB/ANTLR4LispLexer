import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

public class AppTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresa tu cadena: ");
        Scanner sc = new Scanner(System.in);
        String iString = sc.nextLine();
        while (!iString.equals("(exit)")) {
            lispLexerParserEvaluator(iString);
            System.out.print("(tlisp) > ");
            iString = sc.nextLine();
        }
        sc.close();
    }

    public static void lispLexerParserEvaluator(String iString) {
        // create a CharStream that reads from a String
        CharStream input = CharStreams.fromString(iString);
        // create a lexer that feeds off of input CharStream
        OperacionesLexer lexer = new OperacionesLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        OperacionesParser parser = new OperacionesParser(tokens);
        ParseTree tree = parser.exprS(); // begin parsing at exprS rule

        try {
            tree = parser.exprS(); // begin parsing at exprS rule+

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("That' not a valid expression.");
            return;
        }

        // System.out.println("Expression tree: " + tree.toStringTree(parser)); // print
        // LISP-style tree
        System.out.println("Expression tree: " + tree.toStringTree(parser));
        System.out.println("Val: " + (new TLispPrefixEvaluator()).evaluate(iString));

    }
}
