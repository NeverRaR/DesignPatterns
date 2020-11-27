package balking;

/**
 * @author  NeverRaR
 */
public class Bill {
    private boolean ordered;
    private double curPrice;
    private double totalPrice;
    public Bill(){
        this.ordered=true;//初始状态没有需要下单的餐品
        this.curPrice=0;
        this.totalPrice=0;
    }

    /**
     * 账单中新增菜品,并设置标记
     * @param curPrice
     * 新增菜品价格
     */
    public synchronized void addDish(double curPrice){
        this.curPrice+=curPrice;
        ordered=false;//新增菜品还未下单
    }

    /**
     * 试图点单
     */
    public synchronized void order(){//下单
        if(ordered){
            return;//如果已下单则忽略
        }
        doOrder();
        ordered=true;
    }

    /**
     * 真正下单
     */
    private void doOrder(){
        totalPrice+=curPrice;
        System.out.println("Bill:("+hashCode()+"):doOrder:"+Thread.currentThread().getName()+" calls order!");
        System.out.println("Bill:("+hashCode()+"):doOrder:"+"new ordered dishes worth "+ curPrice);
        curPrice=0;
        System.out.println("Bill:("+hashCode()+"):doOrder:"+"now total consumption is "+totalPrice);
    }
}
