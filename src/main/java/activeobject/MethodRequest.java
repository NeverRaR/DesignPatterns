package activeobject;

/**
 * @author  NeverRaR
 */
public abstract class MethodRequest {
    protected final Servant servant;
    protected final FutureResult future;
    protected MethodRequest(Servant servant,FutureResult future){
         this.servant=servant;
         this.future=future;
    }

    /**
     * execute request
     */
    public abstract void execute();

};
