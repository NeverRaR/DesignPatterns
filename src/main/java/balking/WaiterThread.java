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
                sleep(1000);//Ask once a second
                bill.order();//Ask customer to order
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
