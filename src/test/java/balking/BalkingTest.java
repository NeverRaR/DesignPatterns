package balking;

import junit.framework.TestCase;
import org.junit.Test;


public class BalkingTest extends TestCase {
    @Test
    public void test() throws InterruptedException {
        System.out.println("Test balking:");
        Bill bill =new Bill();
        CustomerThread customerThread=new CustomerThread("customer", bill);
        WaiterThread waiterThread=new WaiterThread("waiter", bill);
        customerThread.start();
        waiterThread.start();
        customerThread.join();
        waiterThread.join();

    }
}
