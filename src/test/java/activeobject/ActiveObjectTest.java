package activeobject;

import org.junit.Test;

public class ActiveObjectTest {
    @Test
    public  void main() {

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
