package state;

public class OffState implements State{
    private static final OffState singleton = new OffState();
    private OffState(){}
    public static State getInstance(){
        return singleton;
    }

    @Override
    public void doUse(Device device) {
        System.out.println("This device is off. You must turn it on first!");
    }

    @Override
    public void doOn(Device device) {
        System.out.println("Successfully turn it on!");
        device.changeState(OnState.getInstance());
    }

    @Override
    public void doOff(Device device) {
        System.out.println("This device is already off.");
    }

    @Override
    public void doDown(Device device) {
        System.out.println("Oops! This device is broken down.");
        device.changeState(ErrorState.getInstance());
    }

    @Override
    public void doFix(Device device) {
        System.out.println("This device works well now. No needs to fix");
    }

    public String toString(){
        return "Off";
    }
}
