package activeobject;

/**
 * @author  NeverRaR
 */
public class SchedulerThread extends Thread {
    private  final ActivationQueue queue;
    private  boolean dead=false;
    public SchedulerThread(ActivationQueue queue){
        this.queue=queue;
    }

    /**
     * 发起方法调用
     * @param request
     * 方法调用请求
     */
    public void invoke(MethodRequest request){
        if(isDead()) return;
        queue.putRequest(request);
    }

    /**
     * 将SchedulerThread设置为已死亡
     */
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

    /**
     *
     * 判断SchedulerThread是否死亡
     * @return
     * 是否死亡
     */
    public boolean isDead() {
        return dead;
    }

}
