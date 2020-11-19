package futurepromise;

public class FutureOrder implements Order {
    private RealOrder realOrder = null;
    private boolean isReady = false;

    public synchronized void setRealOrder(RealOrder r) {
        if (isReady) {
            return;
        }
        this.realOrder = r;
        this.isReady = true;
        notifyAll();
    }

    @Override
    public synchronized Dishes getDishes() {
        while (!isReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realOrder.getDishes();
    }
}
