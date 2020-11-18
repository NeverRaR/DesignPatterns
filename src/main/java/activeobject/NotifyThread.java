package activeobject;

import java.util.Date;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class NotifyThread extends Thread{
    private ConcurrentLinkedQueue queue;
    private AtomicInteger notifyCount;
    public NotifyThread(String name,int notifyCount){
        super(name);
        this.queue=new ConcurrentLinkedQueue();
        this.notifyCount=new AtomicInteger(notifyCount);
    }
    public void putResult(Result result){
        queue.offer(result);
    }
    @Override
    public void run() {
        while(notifyCount.get()>0){
            Result result=(Result) queue.poll();
            if(result==null) continue;
            notifyCount.getAndDecrement();
             String value = (String) result.getResultValue();
             System.out.println(new Date()+" "+Thread.currentThread().getName()+":"+value);
        }
    }


}
