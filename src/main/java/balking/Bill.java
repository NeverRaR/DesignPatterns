package balking;

/**
 * @author  NeverRaR
 */
public class Bill {
    private boolean ordered;
    private double curPrice;
    private double totalPrice;
    public Bill(){
        this.ordered=true;//in the initial state, there is no meal to order
        this.curPrice=0;
        this.totalPrice=0;
    }

    /**
     * Add dish to the bill and set a mark
     * @param curPrice
     * price of new dish
     */
    public synchronized void addDish(double curPrice){
        this.curPrice+=curPrice;
        ordered=false;//new dish has not been ordered
    }

    /**
     * try to order
     */
    public synchronized void order(){//order
        if(ordered){
            return;//ignore if has ordered
        }
        doOrder();
        ordered=true;
    }

    /**
     * order truly
     */
    private void doOrder(){
        totalPrice+=curPrice;
        System.out.println("Bill:("+hashCode()+"):doOrder:"+Thread.currentThread().getName()+" calls order!");
        System.out.println("Bill:("+hashCode()+"):doOrder:"+"new ordered dishes worth "+ curPrice);
        curPrice=0;
        System.out.println("Bill:("+hashCode()+"):doOrder:"+"now total consumption is "+totalPrice);
    }
}
