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
     * get child's height
     * @return
     * height
     */
    public double getChildHeight() {
        return childHeight;
    }

}
