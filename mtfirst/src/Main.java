import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.File;

/**
 * Created by pinkdonut on 20.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();
        ANTLRInputStream input = new ANTLRInputStream(translator.toDecimal(new File("input.txt")));
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(stream);
        System.out.println(translator.toRoman(parser.getResult()));
    }
}