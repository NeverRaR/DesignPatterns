package strategy;

/**
 * @Title: goToChillingRestaurant.java
 *
 * @Package strategy
 *
 * @Description: the implementation of MovingMethod, try to go to Mid-Hillside Chalet
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class goToMidHillsideChalet implements MovingMethod{

    /**
     * @Description: override the specific execute method
     *
     * @return: he specific execute method
     */
    @Override
    public String execute() {
        return "Reaching Mid-Hillside Chalet with a dog sled.";
    }
}
