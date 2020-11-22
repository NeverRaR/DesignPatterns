package activeobject;

public class Proxy implements ActiveObject{
    private final SchedulerThread scheduler;
    private final Servant servant;
    public Proxy(SchedulerThread scheduler,Servant servant){
        this.scheduler=scheduler;
        this.servant=servant;
    }

    @Override
    public Result solveEvent(String message) {
        FutureResult future=new FutureResult();
        scheduler.invoke(new SolveEventRequest(servant,future,message));
        return future;
    }

    @Override
    public void kill(){
        scheduler.setDead();
    }
}
