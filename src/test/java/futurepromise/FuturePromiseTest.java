package futurepromise;

import org.junit.Test;

public class FuturePromiseTest {
    @Test
    public void main() {
        System.out.println("Test Future Promise: ");
        Kitchen kitchen = new Kitchen();
        Dishes d1 = new Dishes("Fried Chicken", 12);
        Dishes d2 = new Dishes("Apple Pie", 2);
        System.out.println("Begin send request to kitchen: ");
        Order order1 = kitchen.request(d1);
        Order order2 = kitchen.request(d2);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All Oders are Done.");
    }

}
