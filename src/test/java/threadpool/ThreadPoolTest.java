package threadpool;

import junit.framework.TestCase;
import org.junit.Test;

import threadpool.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Test thread pool:");
        System.out.println("Initializing tasks...");
        List<Task> taskList = new ArrayList<>();
        taskList.add(new NavigationTask(2));
        taskList.add(new NavigationTask(3));
        taskList.add(new HealthCareTask(2));
        taskList.add(new HealthCareTask(2));
        taskList.add(new NavigationTask(4));
        taskList.add(new HealthCareTask(2));
        taskList.add(new NavigationTask(2));
        taskList.add(new NavigationTask(2));
        taskList.add(new HealthCareTask(1));
        taskList.add(new HealthCareTask(5));
        taskList.add(new NavigationTask(2));
        taskList.add(new HealthCareTask(2));
        taskList.add(new NavigationTask(4));
        taskList.add(new HealthCareTask(2));
        taskList.add(new NavigationTask(6));
        taskList.add(new NavigationTask(2));
        taskList.add(new HealthCareTask(3));
        taskList.add(new NavigationTask(2));
        taskList.add(new NavigationTask(4));
        taskList.add(new HealthCareTask(5));
        taskList.add(new NavigationTask(3));
        taskList.add(new NavigationTask(1));
        taskList.add(new HealthCareTask(4));
        taskList.add(new NavigationTask(5));
        int STAFF_COUNT = 3;
        System.out.printf("Configured staff count is %d\n", STAFF_COUNT);
        ExecutorService executor = Executors.newFixedThreadPool(STAFF_COUNT);
        taskList.stream().map(Worker::new).forEach(executor::execute);
        executor.shutdown();
        while (!executor.isTerminated()) {
            Thread.yield();
        }
        System.out.println("All task finished!");
    }
}
