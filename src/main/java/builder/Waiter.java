package builder;

/*
* interface for build and get meals.
* call prepareMeal before getMeal
* */
public class Waiter {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void prepareMeal(){
        mealBuilder.createNewMeal();
        mealBuilder.prepareMeal();
    }

    // return null if prepareMeal method has not been called
    public Meal getMeal(){
        return mealBuilder.getMeal();
    }
}
