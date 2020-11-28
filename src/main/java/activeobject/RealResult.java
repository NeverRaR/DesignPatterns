package activeobject;

/**
 * @author  NeverRaR
 */
public class RealResult extends Result{
    private final Object resultValue;
    public RealResult(Object resultValue){
        this.resultValue=resultValue;
    }

    /**
     * return result
     * @return
     * result
     */
    @Override
    public Object getResultValue() {
        return resultValue;
    }
}
