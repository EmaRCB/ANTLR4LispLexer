import java.util.Scanner;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;

public class AppTest {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("A continuación, ingresa la cadena a evaluar. En caso de querer abandonar el proceso, escriba /o");
        System.out.println("Ingresa tu cadena: ");
        String iString = sc.nextLine();
        while (!iString.equals("/o")) {
            CharStream input = CharStreams.fromString(iString);
            OperacionesLexer lexer = new OperacionesLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            OperacionesParser parser = new OperacionesParser(tokens);
            ParseTree tree = parser.exprS();
            tree = parser.exprS();

            System.out.println("Arbol de expresión: " + tree.toStringTree(parser));
            System.out.println("Resultado: " + (new TLispPrefixEvaluator()).evaluate(iString));
        }
        sc.close();
    }
