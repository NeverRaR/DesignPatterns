package balking;

import java.util.concurrent.ThreadLocalRandom;

public class CustomerThread extends Thread{
    private Customer customer;
    public CustomerThread(String name,Customer customer){
        super(name);
        this.customer=customer;

    }

    @Override
    public void run() {
        try{
            int i=0;
            for(i=0;i<30;++i){
                double extraDish=ThreadLocalRandom.current().nextDouble(200);
                customer.addDish(extraDish);
                sleep(ThreadLocalRandom.current().nextInt(1000));//进餐或者思考
                customer.order();//顾客主动要求点单
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
