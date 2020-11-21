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
    }

    public void visitedBy(String customer) {
        cabin.visitedBy(customer, cabinName);
    }

    public void changeCabin(TrainCabin cabin) {
        this.cabin = cabin;
    }
}
