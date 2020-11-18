package activeobject;

import java.util.ArrayList;
import java.util.Date;

public class SolveEventThread extends Thread{
    private final ActiveObject activeObject;
    private final NotifyThread notifyThread;
    private final int callCount;

    public SolveEventThread(String name,ActiveObject activeObject,int callCount){
        super(name);
        this.callCount=callCount;
        this.notifyThread=new NotifyThread("通知",callCount);
        this.activeObject=activeObject;
    }

    @Override
    public void run() {
        notifyThread.start();
        for (int i = 1; i < callCount+1 ; i++) {
            System.out.println(new Date() + " " + Thread.currentThread().getName() + " calls slove event" + i);
            Result result = activeObject.solveEvent("Event" + i);
            notifyThread.putResult(result);
        }
        activeObject.kill();
    }
}
