package activeobject;

/**
 * @author  NeverRaR
 */
public class SolveEventRequest extends MethodRequest {
    private final String message;
    public SolveEventRequest(Servant servant,FutureResult future,String message){
        super(servant,future);
        this.message=message;
    }

    /**
     * 执行SolveEventRequest
     */
    @Override
    public void execute() {
        Result result=servant.solveEvent(message);
        future.setResult(result);
    }
}
