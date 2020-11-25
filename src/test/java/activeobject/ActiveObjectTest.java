package activeobject;

import junit.framework.TestCase;
import org.junit.Test;

public class ActiveObjectTest extends TestCase {
    @Test
    public  void test() {
        System.out.println("Test active object:");
        try {
            NotifyThread notifyThread=new NotifyThread("Notification",200);
            SolveEventThread solveEventThread =
                    new SolveEventThread("Customer", ActiveObjectFactory.createActiveObject(),notifyThread, 200);
            solveEventThread.start();
            solveEventThread.join();
            notifyThread.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
