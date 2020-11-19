package builder;

/**
 * The type Chicken burger meal builder.
 */
public class ChickenBurgerMealBuilder extends MealBuilder {
    /**
     * Prepare meal with chichen burger and juice
     */
    @Override
    public void prepareMeal() {
        meal.addItem(new ChickenBurger());
        meal.addItem(new Juice());
    }
}
