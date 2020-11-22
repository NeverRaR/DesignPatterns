package balking;

import org.junit.Test;


public class BalkingTest {
    @Test
    public void main() throws InterruptedException {
        Customer customer=new Customer();
        CustomerThread customerThread=new CustomerThread("customer",customer);
        WaiterThread waiterThread=new WaiterThread("waiter",customer);
        customerThread.start();
        waiterThread.start();
        customerThread.join();
        waiterThread.join();

    }
}
