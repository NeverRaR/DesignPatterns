package strategy;

public class goToChillingRestaurant implements MovingMethod{
    @Override
    public String execute() {
        return "The Chilling Restaurant was reached by walking.";
    }
}
