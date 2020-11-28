package activeobject;

import java.util.Date;

/**
 * @author  NeverRaR
 */
public class Proxy implements ActiveObject{
    private final SchedulerThread scheduler;
    private final Servant servant;
    public Proxy(SchedulerThread scheduler,Servant servant){
        this.scheduler=scheduler;
        this.servant=servant;
    }

    /**
     * convert the called function into corresponding "MethodRequest" and send to "scheduler"
     *
     * @param message
     * message of complaint
     *
     * @return
     * solve result
     */
    @Override
    public Result solveEvent(String message) {
        System.out.println("Proxy:("+hashCode()+"):solveEvent:"+ "customer calls solve "+message+" at "+new Date());
        FutureResult future=new FutureResult();
        scheduler.invoke(new SolveEventRequest(servant,future,message));
        return future;
    }

    /**
     * end the active object
     */
    @Override
    public void kill(){
        scheduler.setDead();
    }
}
