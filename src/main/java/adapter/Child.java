package adapter;

/**
 * @author  NeverRaR
 */
public class Child {
    private double childHeight=1.4;

    public Child() {
    }

    public Child(double childHeight) {
        this.childHeight=childHeight;

    }

    /**
     * 设置孩子身高
     * @return
     * 身高
     */
    public double getChildHeight() {
        return childHeight;
    }

}
