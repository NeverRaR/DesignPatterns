package futurepromise;

public class Kitchen {
    public Order request(final Dishes d) {
        System.out.println("Kitchen: " + d.name + "'s order begin to send.");
        final FutureOrder futureOrder = new FutureOrder();
        new Thread(() -> {
            RealOrder realOrder = new RealOrder(d);
            futureOrder.setRealOrder(realOrder);
        }).start();
        System.out.println("Kitchen: " + d.name + "'s order is Sent !");
        return futureOrder;
    }

}
