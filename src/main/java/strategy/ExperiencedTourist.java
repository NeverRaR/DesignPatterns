package strategy;

/**
 * @Title: ExperiencedTourist.java
 *
 * @Package strategy
 *
 * @Description: class of an Experienced Tourist, defines basic ops of Experienced Tourist
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class ExperiencedTourist {

    private MovingMethod method;

    /**
     * @Description: constructor, initialize with a new MovingMethod
     *
     * @param method: new MovingMethod
     */
    public ExperiencedTourist(MovingMethod method) {
        this.method = method;
    }

    /**
     * @Description: change the method
     *
     * @param method: new MovingMethod
     */
    public void changeMethod(MovingMethod method) {
        this.method = method;
    }

    /**
     *
     * @Description: go to the destination, execute the method
     */
    public void goToDestination() {
        System.out.println(method.execute());
    }
}
