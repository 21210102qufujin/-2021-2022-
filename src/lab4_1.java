//需要注意的是import的时候最好复制粘贴，小心打错字！！！！
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class lab4_1 {
    public static void main(String[] args) throws FileNotFoundException {
        String inputName=args[0];

        String input1 = "";
        StringBuilder input2 = new StringBuilder();
        try (Scanner sc = new Scanner(new FileReader(inputName))) {
            while (sc.hasNextLine()) {
                String str = sc.nextLine() + "\n";
                input2.append(str);
            }
        }
        System.out.println(input2);
        for (int i = 0, j = 0; i < input2.length(); i++, j++) {
            if (input2.charAt(i) == '/' && input2.charAt(i + 1) == '/') {
                i++;
                i++;
                while (input2.charAt(i) != '\n') {
                    i++;
                }
                i++;
            } else if (input2.charAt(i) == '/' && input2.charAt(i + 1) == '*') {
                i++;
                i++;
                while (!(input2.charAt(i) == '*' && input2.charAt(i + 1) == '/')) {
                    i++;
                }
                i++;
                i++;
            }
            if (input2.charAt(i) == ' ' || input2.charAt(i) == '\n' || input2.charAt(i) == '\t') {
                continue;
            }
            input1 += input2.charAt(i) + "";

        }
        CharStream inputStream = CharStreams.fromString(input1.toString());
        lab4Lexer lexer = new lab4Lexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        lab4Parser parser = new lab4Parser(tokenStream);
        ParseTree tree = parser.compUnit();
        Visitor visitor = new Visitor();
        visitor.visit(tree);
        String outputName = args[1];
        PrintStream ps = new PrintStream(outputName);
        System.setOut(ps);
        for (int i = 0; i < Visitor.ir_code.size(); i++) {
            System.out.print(Visitor.ir_code.get(i));
        }
    }
}
