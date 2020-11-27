package command;

import junit.framework.TestCase;
import org.junit.Test;

public class CommandTest extends TestCase {

    @Test
    public void test() {
        System.out.println("Test command pattern:");
        //give command, can change content and order of command
        Command command = new Command();
        PutUp up = new PutUp(command);
        PutDown down = new PutDown(command);
        //execute command
        Operator operator = new Operator();
        operator.takeCommand(up);
        operator.takeCommand(down);
        operator.takeCommand(up);
    }
}
