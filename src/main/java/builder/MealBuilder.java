package builder;

/**
 * The type Meal builder.
 * Inherited by specific MealBuilder
 * e.g HamburgerMealBuilder
 */
public abstract class MealBuilder {
    /**
     * The Meal to be built.
     */
    protected Meal meal;

    /**
     * Create new meal.
     */
    public void createNewMeal(){meal = new Meal();}

    /**
     * Get meal.
     *
     * @return the meal
     */
    public Meal getMeal(){return meal;}

    /**
     * Prepare meal.
     * to be override
     */
    public abstract void prepareMeal(); // build a meal

}
