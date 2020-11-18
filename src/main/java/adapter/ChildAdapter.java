package adapter;

public class ChildAdapter extends Adult{
    private Child adaptee;
    public  ChildAdapter() {
        adaptee=new Child();
    }
    public ChildAdapter(Child adaptee) {
        this.adaptee=adaptee;
    }
    @Override
    public double getAdultHeight() {
        return adaptee.getChildHeight()+0.5;
    }
}
