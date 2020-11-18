package balking;


public class WaiterThread extends Thread{
    private Customer customer;
    public WaiterThread(String name,Customer customer){
        super(name);
        this.customer=customer;

    }

    @Override
    public void run() {
        try{
            int i=0;
            for(i=0;i<15;++i){
                sleep(1000);//1s询问一次
                customer.order();//询问顾客点单
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
