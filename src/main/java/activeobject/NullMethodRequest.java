package activeobject;

public class NullMethodRequest extends MethodRequest{

    protected NullMethodRequest(){
        super(null,null);
    }

    @Override
    public void execute() {

    }
}
