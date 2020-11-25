package balking;

import junit.framework.TestCase;
import org.junit.Test;


public class BalkingTest extends TestCase {
    @Test
    public void test() throws InterruptedException {
        Customer customer=new Customer();
        CustomerThread customerThread=new CustomerThread("customer",customer);
        WaiterThread waiterThread=new WaiterThread("waiter",customer);
        customerThread.start();
        waiterThread.start();
        customerThread.join();
        waiterThread.join();

    }
}
