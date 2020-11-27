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
     * 返回结果
     * @return
     * 结果
     */
    @Override
    public Object getResultValue() {
        return resultValue;
    }
}
