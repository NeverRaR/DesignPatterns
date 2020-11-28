package balking;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author  NeverRaR
 */
public class CustomerThread extends Thread{
    private Bill bill;
    public CustomerThread(String name, Bill bill){
        super(name);
        this.bill = bill;

    }

    @Override
    public void run() {
        try{
            int i=0;
            for(i=0;i<30;++i){
                double extraDish=ThreadLocalRandom.current().nextDouble(200);
                bill.addDish(extraDish);
                sleep(ThreadLocalRandom.current().nextInt(1000));//having a meal or thinking
                bill.order();//customers take the initiative to order
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
