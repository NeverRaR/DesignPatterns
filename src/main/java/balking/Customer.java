package balking;

public class Customer {
    private boolean ordered;
    private double curPrice;
    private double totalPrice;
    public Customer(){
        this.ordered=true;//初始状态没有需要下单的餐品
        this.curPrice=0;
        this.totalPrice=0;
    }
    public synchronized void addDish(double curPrice){//顾客新增菜品
        this.curPrice+=curPrice;
        ordered=false;//新增菜品还未下单
    }

    public synchronized void order(){//下单
        if(ordered){
            return;//如果已下单则忽略
        }
        doOrder();
        ordered=true;
    }

    //真正下单调用的方法
    private void doOrder(){
        totalPrice+=curPrice;
        System.out.println(Thread.currentThread().getName()+" calls order!");
        System.out.println("new ordered dishes worth "+ curPrice);
        curPrice=0;
        System.out.println("now total consumption is "+totalPrice);
    }
}
