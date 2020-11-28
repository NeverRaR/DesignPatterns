package activeobject;

import java.util.Date;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author  NeverRaR
 */
public class NotifyThread extends Thread{
    private ConcurrentLinkedQueue<Result> queue;
    private AtomicInteger notifyCount;
    public NotifyThread(String name,int notifyCount){
        super(name);
        this.queue=new ConcurrentLinkedQueue<Result>();
        this.notifyCount=new AtomicInteger(notifyCount);
    }

    /**
     * put a result into notify thread
     * @param result
     * result to be put into
     */
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
            if(value!=null)System.out
                    .println("NotifyThread:("+hashCode()+"):run:"
                            +Thread.currentThread().getName()
                            +" notifies "+value+" at "+new Date());
        }
    }


}
