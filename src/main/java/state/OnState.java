package state;

/**
 * The type On state.
 */
public class OnState implements State{
    // singleton
    private static final OnState singleton = new OnState();
    private OnState(){}

    /**
     * Get instance state.
     *
     * @return the state
     */
    public static State getInstance(){
        return singleton;
    }

    /**
     * Use current device.
     *
     * @param device the device
     */
    @Override
    public void doUse(Device device) {
        System.out.println("[OnState:" +toString()+ ":doUse]: This device is On. Successfully use it!");
    }

    /**
     * Turn on current device.
     *
     * @param device the device
     */
    @Override
    public void doOn(Device device) {
        System.out.println("[OnState:" +toString()+ ":doOn]: This device is already on.");
    }

    /**
     * Turn off current device.
     *
     * @param device the device
     */
    @Override
    public void doOff(Device device) {
        System.out.println("[OnState:" +toString()+ ":doOff]: Turn off this device.");
        device.changeState(OffState.getInstance());
    }

    /**
     * Break down current device.
     *
     * @param device the device
     */
    @Override
    public void doDown(Device device) {
        System.out.println("[OnState:" +toString()+ ":doDown]: Oops! This device is broken down.");
        device.changeState(ErrorState.getInstance());
    }

    /**
     * Fix the current device.
     *
     * @param device the device
     */
    @Override
    public void doFix(Device device) {
        System.out.println("[OnState:" +toString()+ ":doFix]: This device works well now. No needs to fix");
    }

    /**
     * To string.
     *
     * @return the current state
     */
    public String getState(){
        return "On";
    }
}
