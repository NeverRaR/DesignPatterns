package strategy;

/**
 * @Title: goToChillingRestaurant.java
 *
 * @Package strategy
 *
 * @Description: the implementation of MovingMethod, try to go to Paradise Exit
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class goToParadiseExit implements MovingMethod{

    /**
     * @Description: override the specific execute method
     *
     * @return: he specific execute method
     */
    @Override
    public String execute() {
        return "Using the Electric Vehicles to reach the Paradise Exit";
    }
}
