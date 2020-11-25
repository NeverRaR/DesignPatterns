package command;

/**
 * define PutDown class, which can be used by user to put down props
 * @author 1853615邓斯语
 */
public class PutDown implements Order {

    private Command command;

    /**
     * constructor
     * @param down
     */
    public PutDown(Command down) {
        this.command = down;
    }

    /**
     * execute put down
     */
    public void execute() {
        command.putDown();
    }
}
