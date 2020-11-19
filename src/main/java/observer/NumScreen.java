package observer;

/**
 * The type Num screen.
 * showing num
 */
public class NumScreen extends NumObserver {
    /**
     * Instantiates a new Num screen.
     *
     * @param peopleNum the people num(Observable)
     */
    public NumScreen(PeopleNum peopleNum) {
        super(peopleNum);
    }

    /**
     * Update.
     *
     * @param num the people num value
     */
    @Override
    public void update(int num) {
        show();
    }

    /**
     * Show num.
     */
    public void show(){
        System.out.println("There are " + peopleNum.getVal() + " people in the park now. Have a good day!");
    }
}
