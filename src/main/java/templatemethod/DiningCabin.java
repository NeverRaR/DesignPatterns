package templatemethod;

/**
 * @author nemo
 */
public class DiningCabin extends TrainCabin {

    @Override
    protected void serve(String customer, String cabinName) {
        System.out.println(
            String.format("(" + this.toString() + "): " + "%s had a good meal in %s.", customer, cabinName)
        );
    }
}
