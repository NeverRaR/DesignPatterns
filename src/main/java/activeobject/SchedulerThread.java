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
     * create a function call
     * @param request
     * request for function call
     */
    public void invoke(MethodRequest request){
        if(isDead()) return;
        queue.putRequest(request);
    }

    /**
     * set "SchedulerThread" dead
     */
    public void setDead(){//active object stops receiving request
        if(isDead()) return;
        this.dead=true;
        queue.putRequest(new NullMethodRequest());//put an empty request to wake up thread
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
     * judge whether "SchedulerThread" is dead or not
     * @return
     * dead or not
     */
    public boolean isDead() {
        return dead;
    }

}
