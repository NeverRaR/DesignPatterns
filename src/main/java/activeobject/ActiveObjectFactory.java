package activeobject;

/**
 * @author  NeverRaR
 */
public class ActiveObjectFactory {
    /**
     * create an active object
     * @return
     * an active object
     */
    public static ActiveObject createActiveObject(){
        Servant servant=new Servant();
        ActivationQueue queue=new ActivationQueue();
        SchedulerThread scheduler=new SchedulerThread(queue);
        Proxy proxy=new Proxy(scheduler,servant);
        scheduler.start();
        return proxy;

    }
}
