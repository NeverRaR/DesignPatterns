package interpreter;

import org.junit.Test;

public class InterpreterTest {
    @Test
    public void test(){
        System.out.println("(" + this.toString() + ") : " + "Testing Interpreter");
        String[] str = {"KCKL", "2", "NMC", "1", "KQS", "3"};
        Context context = new Context(str);
        Node Interpreter = new ExpressionNode();
        Interpreter.Interpret(context);
        Interpreter.Execute();
    }
}
