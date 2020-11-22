package templatemethod;

public abstract class TrainCabin {

    protected abstract void serve(String customer, String cabinName);

    private String cabinName;

    public void visitedBy(String customer, String cabinName) {
        System.out.println(String.format("%s enters %s.", customer, cabinName));
        serve(customer, cabinName);
    }
}