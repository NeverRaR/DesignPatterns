package state;

/**
 * The interface State.
 */
public interface State {
    /**
     * Do use.
     *
     * @param device the device
     */
    void doUse(Device device);

    /**
     * Turn on.
     *
     * @param device the device
     */
    void doOn(Device device);

    /**
     * Turn off.
     *
     * @param device the device
     */
    void doOff(Device device);

    /**
     * Break down.
     *
     * @param device the device
     */
    void doDown(Device device);

    /**
     * Do fix.
     *
     * @param device the device
     */
    void doFix(Device device);
}
