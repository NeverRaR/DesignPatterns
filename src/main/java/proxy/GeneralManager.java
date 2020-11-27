package proxy;

/**
 * @author 1754025徐菡志
 */

public class GeneralManager implements IFinanceManager{

    /**
     * The constructor of GeneralManager class.
     */
    public GeneralManager(){
        System.out.println(getClass().getSimpleName() +
                ":(" +
                this.hashCode() +
                "):GeneralManager():create the object of GeneralManager successfully.");
    }

    /**
     * The method used to manage financial work.
     */
    @Override
    public void manageFinance(){

        System.out.println(getClass().getSimpleName()+
                ":(" +
                this.hashCode()+
                "):manageFinance():manage financial work.");
    }
}
