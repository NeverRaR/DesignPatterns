package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The type People num(Observable)
 */
public class PeopleNum {
    private final List<NumObserver> numObservers = new ArrayList<>();
    private int val;

    /**
     * Instantiates a new People num.
     */
    public PeopleNum() {
        val = 0;
    }

    /**
     * Gets val.
     *
     * @return the val
     */
    public int getVal() {
        return val;
    }

    /**
     * Sets val.
     *
     * @param val the val
     */
    public void setVal(int val) {
        this.val = val;
        notifyAllObservers();
    }

    /**
     * Attach.
     *
     * @param newObserver the new observer
     */
    public void attach(NumObserver newObserver){
        numObservers.add(newObserver);
    }

    /**
     * Delete observer.
     *
     * @param targetObserver the target observer to be deleted
     */
    public void deleteObserver(NumObserver targetObserver){
        numObservers.remove(targetObserver);
    }

    /**
     * Notify all observers.
     * called when update value.
     */
    public void notifyAllObservers(){
        for (NumObserver observer : numObservers) {
            observer.update(this.val);
        }
    }
}
