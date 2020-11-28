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
    public void doUse(){
        state.doUse(this);
    }

    /**
     * Turn on.
     */
    public void doOn(){
        state.doOn(this);
    }

    /**
     * Turn off.
     */
    public void doOff(){
        state.doOff(this);
    }

    /**
     * Break down.
     */
    public void doDown(){
        state.doDown(this);
    }

    /**
     * Do fix.
     */
    public void doFix(){
        state.doFix(this);
    }

}
