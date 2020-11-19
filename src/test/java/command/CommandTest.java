package command;

import org.junit.Test;

public class CommandTest {
    @Test
    public void main() {
        System.out.println("Test command:");
        //下命令
        Command command = new Command();
        PutUp up = new PutUp(command);
        PutDown down = new PutDown(command);
        //执行命令
        Operator operator = new Operator();
        operator.takeCommand(up);
        operator.takeCommand(down);
        operator.takeCommand(up);
    }
}
