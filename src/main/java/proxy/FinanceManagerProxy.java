package proxy;

/**
 * @author 1754025徐菡志
 */

public class FinanceManagerProxy implements IFinanceManager{

    private IFinanceManager target;

    /**
     * The constructor of FinanceManagerProxy class.
     * @param target:target proxy.
     */
    public FinanceManagerProxy(IFinanceManager target){
        this.target = target;
        System.out.println(getClass().getSimpleName() +
                ":(" +
                this.hashCode() +
                "):FinanceManagerProxy():create the object of FinanceManagerProxy successfully.");
    }

    /**
     * Proxy method,used as an alternative to managing financial methods.
     */
    @Override
    public void manageFinance() {
        System.out.println("Proxy Method Start...");
        target.manageFinance();
        System.out.println("Proxy Method Finish.");
    }
}
