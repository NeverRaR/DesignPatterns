package templatemethod;

public class HardSeatCabin extends TrainCabin {
    @Override
    protected void serve(String customer, String cabinName) {
        System.out.println(String.format("%s is having a rest in %s. Hardseat is not so comfort!", customer, cabinName));
    }
}