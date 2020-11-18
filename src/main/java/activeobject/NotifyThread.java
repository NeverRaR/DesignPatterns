package activeobject;

import java.util.Date;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class NotifyThread extends Thread{
    private ConcurrentLinkedQueue<Result> queue;
    private AtomicInteger notifyCount;
    public NotifyThread(String name,int notifyCount){
        super(name);
        this.queue=new ConcurrentLinkedQueue<Result>();
        this.notifyCount=new AtomicInteger(notifyCount);
    }
    public void putResult(Result result){
        if(result==null) return;
        queue.offer(result);
    }
    @Override
    public void run() {
        while(notifyCount.get()>0){
            Result result= queue.poll();
            if(result==null) continue;
            notifyCount.getAndDecrement();
            String value = (String) result.getResultValue();
            if(value!=null)System.out.println(new Date()+" "+Thread.currentThread().getName()+" "+value);
        }
    }


}
