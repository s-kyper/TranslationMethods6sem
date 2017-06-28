import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(new FileReader("input.txt"));
        virtualMachineLexer lexer = new virtualMachineLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        virtualMachineParser parser = new virtualMachineParser(tokens);
        ParseTree tree = parser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        Listener listener = new Listener();
        walker.walk(listener, tree);

        FileWriter fileWriter = new FileWriter("output.txt");
        for (int i = 0; i < listener.stack.size(); i++) {
            if (listener.stack.get(i).value != null) {
                fileWriter.write((i+1) + ": " +listener.stack.get(i).operation + "\t" + listener.stack.get(i).value + "\n");
            } else {
                fileWriter.write((i+1) + ": " + listener.stack.get(i).operation + "\n");
            }
        }
        fileWriter.flush();

        Stack<Operation> program = listener.stack;
        Stack<Integer> memory = new Stack<>();
        HashMap<Integer, Integer> vars = new HashMap<>();

        int i = 0;
        while (i < program.size()) {
            int tmp = 0;
            Operation instr =  program.get(i);
            switch(instr.operation) {
                case "bipush":
                    memory.push(instr.value);
                    break;
                case "istore":
                    vars.put(instr.value, (!memory.isEmpty()) ? memory.peek() : 0);
                    if (!memory.isEmpty())
                        System.err.println(memory.peek());
                    else
                        System.err.println(0);
                    break;
                case "iload":
                    memory.push(vars.get(instr.value));
                    break;
                case "iadd":
                    tmp = memory.pop();
                    memory.push(memory.pop() + tmp);
                    break;
                case "isub":
                    tmp = memory.pop();
                    memory.push(memory.pop() - tmp);
                    break;
                case "imul":
                    tmp = memory.pop();
                    memory.push(memory.pop() * tmp);
                    break;
                case "idiv":
                    tmp = memory.pop();
                    memory.push(memory.pop() / tmp);
                    break;
                case "imod":
                    tmp = memory.pop();
                    memory.push(memory.pop() % tmp);
                    break;
                case "ineg":
                    memory.push(-memory.pop());
                    break;
                case "return":
                    System.err.println(memory.peek());
                    break;
                case "goto":
                    i = instr.value - 2;
                    break;
                case "if_cmpeq":
                    tmp = memory.pop();
                    if (tmp == memory.pop())
                        i = instr.value - 2;
                    break;
                case "if_cmpne":
                    tmp = memory.pop();
                    if (tmp != memory.pop())
                        i = instr.value - 2;
                    break;
                case "if_cmpge":
                    tmp = memory.pop();
                    if (memory.pop() >= tmp)
                        i = instr.value - 2;
                    break;
                case "if_cmple":
                    tmp = memory.pop();
                    if (memory.pop() <= tmp)
                        i = instr.value - 2;
                    break;
                case "if_cmpg":
                    tmp = memory.pop();
                    if (memory.pop() > tmp)
                        i = instr.value - 2;
                    break;
                case "if_cmpl":
                    tmp = memory.pop();
                    if (memory.pop() < tmp)
                        i = instr.value - 2;
                    break;
            }
            i++;
        }

    }
}