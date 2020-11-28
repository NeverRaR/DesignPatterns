package templatemethod;

/**
 * @author nemo
 */
public class HalflingCabin {

    private TrainCabin cabin;
    private String cabinName;

    public HalflingCabin(String cabinName, TrainCabin cabin) {
        this.cabin = cabin;
        this.cabinName = cabinName;
        System.out.printf(
            "(" +
            this.toString() +
            "): " +
            "Cabin is initialized with name %s and cabin %s\n",
            cabinName,
            cabin
        );
    }

    public void visitedBy(String customer) {
        cabin.visitedBy(customer, cabinName);
    }

    public void changeCabin(TrainCabin cabin) {
        this.cabin = cabin;
        System.out.printf(
            "(" + this.toString() + "): " + "Cabin %s's type changed to %s\n",
            this.cabinName,
            cabin
        );
    }
}
