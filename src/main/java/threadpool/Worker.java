package threadpool;

/**
 * Worker implements {@link Runnable} and thus can be executed by {@link
 * java.util.concurrent.ExecutorService}.
 */
public class Worker implements Runnable {


    private final Task task;

    public Worker(final Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println(String.format("%s processing %s", Thread.currentThread().getName(), task.toString()));
        try {
            Thread.sleep(task.getTimeMs());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

