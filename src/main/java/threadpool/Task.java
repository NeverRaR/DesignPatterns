package threadpool;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author nemo
 */
public abstract class Task {

    private static final AtomicInteger ID_GENERATOR = new AtomicInteger();

    private final int id;
    private final int timeMs;

    /**
     * @param timeMs used by underlying task to calculate time neeeded
     */
    public Task(final int timeMs) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.timeMs = timeMs;
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @return time needed
     */
    public int getTimeMs() {
        return timeMs;
    }

    /**
     * @return task description
     */
    @Override
    public String toString() {
        return String.format("id=%d timeMs=%d", id, timeMs);
    }
}
