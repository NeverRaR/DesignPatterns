package threadpool;

/**
 * Worker implements {@link Runnable} and thus can be executed by {@link
 * java.util.concurrent.ExecutorService}.
 * @author nemo
 */
public class Worker implements Runnable {

    private final Task task;

    /**
     * @param task task to execute by worker
     */
    public Worker(final Task task) {
        this.task = task;
    }

    /**
     * run worker
     */
    @Override
    public void run() {
        System.out.println(
            String.format(
                "(" + this.toString() + "): " + "%s processing %s",
                Thread.currentThread().getName(),
                task.toString()
            )
        );
        try {
            Thread.sleep(task.getTimeMs());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
