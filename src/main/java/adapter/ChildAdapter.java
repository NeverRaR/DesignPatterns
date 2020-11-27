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
     * 将孩子身高转化为加高后的身高
     * @return
     * 转化后身高
     */
    @Override
    public double getAdultHeight() {
        return adaptee.getChildHeight()+0.5;
    }
}
