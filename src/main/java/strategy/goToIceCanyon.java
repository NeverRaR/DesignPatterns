package strategy;

/**
 * @Title: goToChillingRestaurant.java
 *
 * @Package strategy
 *
 * @Description: the implementation of MovingMethod, try to go to Ice Canyon
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class goToIceCanyon implements MovingMethod{

    /**
     * @Description: override the specific execute method
     *
     * @return: he specific execute method
     */
    @Override
    public String execute() {
        return "Use the Gondola to reach the Ice Canyon";
    }
}
