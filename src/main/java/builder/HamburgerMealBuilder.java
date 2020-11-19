package builder;


/**
 * The type Hamburger meal builder.
 */
public class HamburgerMealBuilder extends MealBuilder{
    /**
     * Prepare meal with hamburger and Cola
     */
    @Override
    public void prepareMeal() {
        meal.addItem(new Hamburger());
        meal.addItem(new Cola());
    }
}
