package balking;


/**
 * @author  NeverRaR
 */
public class WaiterThread extends Thread{
    private Bill bill;
    public WaiterThread(String name, Bill bill){
        super(name);
        this.bill = bill;

    }

    @Override
    public void run() {
        try{
            int i=0;
            for(i=0;i<15;++i){
                sleep(1000);//1s询问一次
                bill.order();//询问顾客点单
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
