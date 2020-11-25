package command;
/**
 * define PutUp class, which can be used by user to put up props
 * @author 1853615邓斯语
 */
public class PutUp implements Order {
    private Command command;

    /**
     * constructor
     * @param up
     */
    public PutUp(Command up) {
        this.command = up;
    }

    /**
     * execute put up
     */
    public void execute() {
        command.putUp();
    }
}
