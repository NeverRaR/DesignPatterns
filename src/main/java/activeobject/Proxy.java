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
     * 将方法调用转化为对应的MethodRequest并交由scheduler调度
     *
     * @param message
     * 投诉信息
     *
     * @return
     * 解决结果
     */
    @Override
    public Result solveEvent(String message) {
        System.out.println("Proxy:("+hashCode()+"):solveEvent:"+ "customer calls solve "+message+" at "+new Date());
        FutureResult future=new FutureResult();
        scheduler.invoke(new SolveEventRequest(servant,future,message));
        return future;
    }

    /**
     * 结束该主动对象
     */
    @Override
    public void kill(){
        scheduler.setDead();
    }
}
