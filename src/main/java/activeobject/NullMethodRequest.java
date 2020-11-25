package activeobject;

/**
 * @author  NeverRaR
 */
public class NullMethodRequest extends MethodRequest{

    protected NullMethodRequest(){
        super(null,null);
    }

    /**
     * 执行空请求
     */
    @Override
    public void execute() {

    }
}
