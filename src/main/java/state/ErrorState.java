package state;

public class ErrorState implements State{
    // singleton
    private static final ErrorState singleton = new ErrorState();
    private ErrorState(){}
    public static State getInstance(){
        return singleton;
    }

    @Override
    public void doUse(Device device) {
        System.out.println("This device is broken. Failed to use it!");
    }

    @Override
    public void doOn(Device device) {
        System.out.println("This device is broken. Nothing happens!");
    }

    @Override
    public void doOff(Device device) {
        System.out.println("This device is broken. Nothing happens!");
    }

    @Override
    public void doDown(Device device) {
        System.out.println("This device is already broken.");
    }

    @Override
    public void doFix(Device device) {
        System.out.println("Successfully fix the device! Now you can turn it on.");
        device.changeState(OffState.getInstance());
    }

    public String toString(){
        return "Error";
    }
}
