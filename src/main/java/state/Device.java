package state;
/*
*
* */
public class Device {
    private State state = OffState.getInstance();

    public void changeState(State state){
        this.state = state;
    }

    public String getState(){
        return state.toString();
    }

    // use this device
    public void doUse(){
        state.doUse(this);
    }
    // turn on this device
    public void doOn(){
        state.doOn(this);
    }
    // turn off this device
    public void doOff(){
        state.doOff(this);
    }
    // break down this device
    public void doDown(){
        state.doDown(this);
    }
    // fix this device
    public void doFix(){
        state.doFix(this);
    }

}
