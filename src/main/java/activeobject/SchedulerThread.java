package activeobject;

public class SchedulerThread extends Thread {
    private  final ActivationQueue queue;
    private  boolean dead=false;
    public SchedulerThread(ActivationQueue queue){
        this.queue=queue;
    }

    public void invoke(MethodRequest request){
        if(isDead()) return;
        queue.putRequest(request);
    }

    public void setDead(){//主动对象停止接受请求
        if(isDead()) return;
        this.dead=true;
        queue.putRequest(new NullMethodRequest());//放入空请求唤醒线程
    }
    public void run(){
        while(true){
            if(queue.isEmpty()){
                if(isDead()) break;
            }
            MethodRequest request=queue.takeRequest();
            request.execute();
        }
    }

    public boolean isDead() {
        return dead;
    }

}
