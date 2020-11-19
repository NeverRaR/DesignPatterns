package command;

public class PutUp implements Order {
    private Command command;

    public PutUp(Command up) {
        this.command = up;
    }

    public void execute() {
        command.putUp();
    }
}
