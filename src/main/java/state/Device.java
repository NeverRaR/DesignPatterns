package state;

/**
 * The type Device.
 */
public class Device {
    private State state = OffState.getInstance();

    /**
     * Change state.
     *
     * @param newState the new state
     */
    public void changeState(State newState){
        this.state = newState;
    }

    /**
     * Get state string.
     *
     * @return the string
     */
    public String getState(){
        return state.toString();
    }

    /**
     * Do use.
     */
// use this device
    public void doUse(){
        state.doUse(this);
    }

    /**
     * Turn on.
     */
// turn on this device
    public void doOn(){
        state.doOn(this);
    }

    /**
     * Turn off.
     */
// turn off this device
    public void doOff(){
        state.doOff(this);
    }

    /**
     * Break down.
     */
// break down this device
    public void doDown(){
        state.doDown(this);
    }

    /**
     * Do fix.
     */
// fix this device
    public void doFix(){
        state.doFix(this);
    }

}
