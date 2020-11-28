package activeobject;

/**
 * @author  NeverRaR
 */
public class NullMethodRequest extends MethodRequest{

    protected NullMethodRequest(){
        super(null,null);
    }

    /**
     * execute empty request
     */
    @Override
    public void execute() {

    }
}
