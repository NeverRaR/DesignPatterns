package strategy;

/**
 * @Title: goToChillingRestaurant.java
 *
 * @Package strategy
 *
 * @Description: the implementation of MovingMethod, try to go to Chilling Restaurant
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class goToChillingRestaurant implements MovingMethod{

    /**
     * @Description: override the specific execute method
     *
     * @return: he specific execute method
     */
    @Override
    public String execute() {
        return "The Chilling Restaurant was reached by walking.";
    }
}
