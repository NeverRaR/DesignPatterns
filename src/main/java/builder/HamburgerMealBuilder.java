package builder;

/*
 * Build a meal set of hamburger and cola
 * */
public class HamburgerMealBuilder extends MealBuilder{
    @Override
    public void prepareMeal() {
        meal.addItem(new Hamburger());
        meal.addItem(new Cola());
    }
}
