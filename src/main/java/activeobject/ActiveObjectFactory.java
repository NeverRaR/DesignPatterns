package activeobject;

/**
 * @author  NeverRaR
 */
public class ActiveObjectFactory {
    /**
     * 创建一个主动对象
     * @return
     * 主动对象
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
