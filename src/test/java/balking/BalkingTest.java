package balking;

public class BalkingTest {
    public static void main(String[] args) {
        Customer customer=new Customer();
        CustomerThread customerThread=new CustomerThread("custromer",customer);
        WaiterThread waiterThread=new WaiterThread("waiter",customer);
        customerThread.start();
        waiterThread.start();
    }
}
