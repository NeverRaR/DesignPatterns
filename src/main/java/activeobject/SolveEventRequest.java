package activeobject;

public class SolveEventRequest extends MethodRequest {
    private final String message;
    public SolveEventRequest(Servant servant,FutureResult future,String message){
        super(servant,future);
        this.message=message;
    }

    @Override
    public void execute() {
        Result result=servant.solveEvent(message);
        future.setResult(result);
    }
}
