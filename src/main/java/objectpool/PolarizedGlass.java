package objectpool;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * PolarizedGlass are expensive to create.
 */
public class PolarizedGlass {

    private static final AtomicInteger counter = new AtomicInteger(0);

    private final int id;

    /**
     * Constructor.
     */
    public PolarizedGlass() {
        id = counter.incrementAndGet();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("PolarizedGlass id=%d", id);
    }
}

