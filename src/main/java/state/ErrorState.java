package state;

/**
 * The type Error state.
 */
public class ErrorState implements State{
    // singleton
    private static final ErrorState singleton = new ErrorState();
    private ErrorState(){}

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
        System.out.println("[ErrorState:" +toString()+ ":doUse]: This device is broken. Failed to use it!");
    }

    /**
     * Turn on current device.
     *
     * @param device the device
     */
    @Override
    public void doOn(Device device) {
        System.out.println("[ErrorState:" +toString()+ ":doOn]: This device is broken. Nothing happens!");
    }

    /**
     * Turn off current device.
     *
     * @param device the device
     */
    @Override
    public void doOff(Device device) {
        System.out.println("[ErrorState:" +toString()+ ":doOff]: This device is broken. Nothing happens!");
    }

    /**
     * Break down current device.
     *
     * @param device the device
     */
    @Override
    public void doDown(Device device) {
        System.out.println("[ErrorState:" +toString()+ ":doDown]: This device is already broken.");
    }

    /**
     * Fix the current device.
     *
     * @param device the device
     */
    @Override
    public void doFix(Device device) {
        System.out.println("[ErrorState:" +toString()+ ":doFix]: Successfully fix the device! Now you can turn it on.");
        device.changeState(OffState.getInstance());
    }

    /**
     * To string.
     *
     * @return the current state
     */
    public String getState(){
        return "Error";
    }
}
