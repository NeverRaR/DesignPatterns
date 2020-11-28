package adapter;

/**
 * @author  NeverRaR
 */
public class ChildAdapter extends Adult{
    private Child adaptee;
    public  ChildAdapter() {
        adaptee=new Child();
    }
    public ChildAdapter(Child adaptee) {
        this.adaptee=adaptee;
    }

    /**
     * convert child's height into new height
     * @return
     * new height
     */
    @Override
    public double getAdultHeight() {
        return adaptee.getChildHeight()+0.5;
    }
}
