package templatemethod;

public class SaloonCabin extends TrainCabin {
    @Override
    protected void serve(String customer, String cabinName) {
        System.out.println(String.format("%s played some games in %s.", customer, cabinName));
    }
}
