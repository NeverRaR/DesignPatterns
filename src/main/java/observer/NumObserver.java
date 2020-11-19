package observer;

/**
 * The type Num observer.
 */
public abstract class NumObserver {

    /**
     * The People num(Observable).
     */
    protected PeopleNum peopleNum;

    /**
     * Instantiates a new Num observer.
     *
     * @param peopleNum the people num(Observable)
     */
    public NumObserver(PeopleNum peopleNum) {
        this.peopleNum = peopleNum;
        peopleNum.attach(this);
    }

    /**
     * Update.
     *
     * @param num the people num value
     */
    public abstract void update(int num);
}
