import java.util.HashMap;
import java.util.Stack;


public class Listener extends virtualMachineBaseListener {
    public HashMap<String, Integer> varHashMap;
    public Stack<Operation> stack;
    private int varCount = 1;
    private Operation ifOperation;
    private Operation gotoOperation;
    private Operation whileOperation;

    public Listener() {
        varHashMap = new HashMap<>();
        stack = new Stack<>();
    }

    @Override public void exitAssign(virtualMachineParser.AssignContext ctx) {
        if (ctx.TYPE() != null) {
            varHashMap.put(ctx.VAR().getText(), varCount);
            stack.add(new Operation("istore", varCount++));
        } else {
            stack.add(new Operation("istore", varHashMap.get(ctx.VAR().getText())));
        }
    }

    @Override public void enterNum(virtualMachineParser.NumContext ctx) {
        if (ctx.DIGIT() != null) {
            int t = Integer.parseInt(ctx.DIGIT().getText());
            stack.add(new Operation("bipush", t));
        }
        if (ctx.VAR() != null) {
            int t = varHashMap.get(ctx.VAR().getText());
            stack.add(new Operation("iload", t));
        }
    }

    @Override public void exitNum(virtualMachineParser.NumContext ctx) {
        if (ctx.MINUS() != null) {
            stack.add(new Operation("ineg", null));
        }
    }

    @Override public void exitMath(virtualMachineParser.MathContext ctx) {
        if (ctx.PLUS() != null) {
            stack.add(new Operation("iadd", null));
        }
        if (ctx.MINUS() != null) {
            stack.add(new Operation("isub", null));
        }
    }

    @Override public void exitTerm(virtualMachineParser.TermContext ctx) {
        if (ctx.ARITHM1() != null) {
            if (ctx.ARITHM1().getText().equals("*")) {
                stack.add(new Operation("imul", null));
            }
            if (ctx.ARITHM1().getText().equals("/")) {
                stack.add(new Operation("idiv", null));
            }
            if (ctx.ARITHM1().getText().equals("%")) {
                stack.add(new Operation("imod", null));
            }
        }
    }

    @Override public void exitBool(virtualMachineParser.BoolContext ctx) {
        if (ctx.DIGIT() != null) {
            stack.add(new Operation("bipush", Integer.parseInt(ctx.DIGIT().getText())));
        }
        if (ctx.VAR() != null) {
            stack.add(new Operation("iload", varHashMap.get(ctx.VAR().getText())));
        }
    }

    @Override public void exitLogic(virtualMachineParser.LogicContext ctx) {
        if (ctx.CMP() != null) {
            switch (ctx.CMP().getText()) {
                case ">":
                    stack.add(new Operation("if_cmple", null));
                    break;
                case "<":
                    stack.add(new Operation("if_cmpge", null));
                    break;
                case ">=":
                    stack.add(new Operation("if_cmpl", null));
                    break;
                case "<=":
                    stack.add(new Operation("if_cmpg", null));
                    break;
                case "==":
                    stack.add(new Operation("if_cmpne", null));
                    break;
                case "!=":
                    stack.add(new Operation("if_cmpeq", null));
                    break;
            }
            ifOperation = stack.peek();
        }
    }

    @Override public void enterElsesection(virtualMachineParser.ElsesectionContext ctx) {
        ifOperation.value = stack.size() + 1;
    }

    @Override public void exitElsesection(virtualMachineParser.ElsesectionContext ctx) {
        gotoOperation.value = stack.size() + 1;
    }


    @Override public void exitThensection(virtualMachineParser.ThensectionContext ctx) {
        stack.add(new Operation("goto", null));
        gotoOperation = stack.peek();
    }

    @Override public void enterWhile_(virtualMachineParser.While_Context ctx) {
    }

    @Override public void enterWhilesection(virtualMachineParser.WhilesectionContext ctx) {
        whileOperation = stack.peek();
    }


    @Override public void exitWhilesection(virtualMachineParser.WhilesectionContext ctx) {
        stack.add(new Operation("goto", stack.indexOf(whileOperation) - 1));
    }

    @Override public void exitWhile_(virtualMachineParser.While_Context ctx) {
        whileOperation.value = stack.size() + 1;
    }


    @Override public void exitMain(virtualMachineParser.MainContext ctx) {
        stack.add(new Operation("return", null));
    }
}
