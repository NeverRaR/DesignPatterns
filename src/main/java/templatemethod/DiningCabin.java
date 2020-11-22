package templatemethod;

public class DiningCabin extends TrainCabin {
    @Override
    protected void serve(String customer, String cabinName) {
        System.out.println(String.format("%s had a good meal in %s.", customer, cabinName));
    }
}
