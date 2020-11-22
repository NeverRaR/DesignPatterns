package command;

public class PutDown implements Order {
    private Command command;

    public PutDown(Command down) {
        this.command = down;
    }

    public void execute() {
        command.putDown();
    }
}
