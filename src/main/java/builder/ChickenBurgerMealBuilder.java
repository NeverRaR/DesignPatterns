package builder;

/*
 * Build a meal set of chicken burger and juice
 * */
public class ChickenBurgerMealBuilder extends MealBuilder {
    @Override
    public void prepareMeal() {
        meal.addItem(new ChickenBurger());
        meal.addItem(new Juice());
    }
}
