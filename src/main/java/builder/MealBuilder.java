package builder;

/*
* Builder for meal
* Inherited by specific MealBuilder
* e.g HamburgerMealBuilder
* */
public abstract class MealBuilder {
    protected Meal meal;

    public void createNewMeal(){meal = new Meal();}

    public Meal getMeal(){return meal;}

    public abstract void prepareMeal(); // build a meal

}
