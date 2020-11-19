package activeobject;

import java.util.Date;

public class SolveEventThread extends Thread{
    private final ActiveObject activeObject;
    private final NotifyThread notifyThread;
    private final int callCount;

    public SolveEventThread(String name,ActiveObject activeObject,NotifyThread notifyThread,int callCount){
        super(name);
        this.callCount=callCount;
        this.notifyThread=notifyThread;
        this.activeObject=activeObject;
    }

    @Override
    public void run() {
        try {
            notifyThread.start();
            for (int i = 1; i < callCount + 1; i++) {
                System.out.println(new Date() + " " + Thread.currentThread().getName() + " calls slove event" + i);
                Result result = activeObject.solveEvent("Event" + i);
                notifyThread.putResult(result);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        activeObject.kill();
    }
}
