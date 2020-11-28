package observer;

/**
 * The type Entrance employee.
 * check people num and control entrance
 */
public class EntranceEmployee extends NumObserver{
    private final int tolerance;

    /**
     * Instantiates a new Entrance employee.
     *
     * @param peopleNum the people num(Observable)
     */
    public EntranceEmployee(PeopleNum peopleNum) {
        super(peopleNum);
        tolerance = 100;
    }

    /**
     * Instantiates a new Entrance employee.
     *
     * @param peopleNum the people num(Observable)
     * @param tolerance the tolerance of people num
     */
    public EntranceEmployee(PeopleNum peopleNum, int tolerance) {
        super(peopleNum);
        this.tolerance = tolerance;
    }


    /**
     * Update.
     *
     * @param num people num value
     */
    @Override
    public void update(int num) {
        if(num > tolerance){
            limitNum();
        }
    }

    /**
     * Limit people num.
     */
    public void limitNum(){
        System.out.print("[EntranceEmployee:" + toString() + ":limitNum]: Num of People is over " + tolerance + " now! ");
        System.out.println("Start limit users crowding.");
    }
}
