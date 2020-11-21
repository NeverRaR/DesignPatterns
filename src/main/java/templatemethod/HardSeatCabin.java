package templatemethod;

/**
 * @author nemo
 */
public class HardSeatCabin extends TrainCabin {

    @Override
    protected void serve(String customer, String cabinName) {
        System.out.println(
            String.format("(" + this.toString() + "): " +
                "%s is having a rest in %s. Hardseat is not so comfort!",
                customer,
                cabinName
            )
        );
    }
}
