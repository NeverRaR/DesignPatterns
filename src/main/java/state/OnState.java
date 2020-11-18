package state;

public class OnState implements State{
    private static final OnState singleton = new OnState();
    private OnState(){}
    public static State getInstance(){
        return singleton;
    }

    @Override
    public void doUse(Device device) {
        System.out.println("This device is On. Successfully use it!");
    }

    @Override
    public void doOn(Device device) {
        System.out.println("This device is already on.");
    }

    @Override
    public void doOff(Device device) {
        System.out.println("Turn off this device.");
        device.changeState(OffState.getInstance());
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
        return "On";
    }
}
