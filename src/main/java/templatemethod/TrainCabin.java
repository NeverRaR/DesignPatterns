package templatemethod;

/**
 * @author nemo
 */
public abstract class TrainCabin {

    protected abstract void serve(String customer, String cabinName);

    private String cabinName;

    /**
     * @param customer customer name
     * @param cabinName cabin name
     */
    public void visitedBy(String customer, String cabinName) {
        System.out.println(
            String.format(
                "(" + this.toString() + "): " + "%s enters %s.",
                customer,
                cabinName
            )
        );
        serve(customer, cabinName);
    }
}
