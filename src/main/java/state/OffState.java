package state;

/**
 * The type Off state.
 */
public class OffState implements State{
    // singleton
    private static final OffState singleton = new OffState();
    private OffState(){}

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
        System.out.println("[OffState:doUse]: This device is off. You must turn it on first!");
    }

    /**
     * Turn on current device.
     *
     * @param device the device
     */
    @Override
    public void doOn(Device device) {
        System.out.println("[OffState:doOn]: Successfully turn it on!");
        device.changeState(OnState.getInstance());
    }

    /**
     * Turn off current device.
     *
     * @param device the device
     */
    @Override
    public void doOff(Device device) {
        System.out.println("[OffState:doOff]: This device is already off.");
    }

    /**
     * Break down current device.
     *
     * @param device the device
     */
    @Override
    public void doDown(Device device) {
        System.out.println("[OffState:doDown]: Oops! This device is broken down.");
        device.changeState(ErrorState.getInstance());
    }

    /**
     * Fix the current device.
     *
     * @param device the device
     */
    @Override
    public void doFix(Device device) {
        System.out.println("[OffState:doFix]: This device works well now. No needs to fix");
    }

    /**
     * To string.
     *
     * @return the current state
     */
    public String toString(){
        return "Off";
    }
}
