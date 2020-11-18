package state;

public interface State {
    void doUse(Device device);
    void doOn(Device device);
    void doOff(Device device);
    void doDown(Device device);
    void doFix(Device device);
}
