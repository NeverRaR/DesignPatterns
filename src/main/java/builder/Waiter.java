package builder;

/**
 * The type Waiter.
 * interface for build and get meals.
 * call prepareMeal before getMeal
 */
public class Waiter {
    private MealBuilder mealBuilder;

    /**
     * Sets meal builder.
     *
     * @param mealBuilder the meal builder
     */
    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    /**
     * Prepare meal with mealBuilder.
     */
    public void prepareMeal(){
        mealBuilder.createNewMeal();
        mealBuilder.prepareMeal();
    }

    /**
     * Get meal.
     *
     * @return the meal, null if prepareMeal method has not been called
     */
    public Meal getMeal(){
        return mealBuilder.getMeal();
    }
}
