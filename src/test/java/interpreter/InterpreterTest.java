package interpreter;

import junit.framework.TestCase;
import org.junit.Test;

public class InterpreterTest extends TestCase {
    @Test
    public void test(){
        System.out.println("(" + this.toString() + ") : " + "Testing Interpreter");
        String[] str = {"KCKL", "2", "NMC", "1", "KQS", "3"};
        Context context = new Context(str);
        Node Interpreter = new ExpressionNode();
        Interpreter.interpret(context);
        Interpreter.execute();
    }
}
