package builder;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void main(){
        // create a waiter
        Waiter waiter = new Waiter();
        // ready to build hamburger meal
        waiter.setMealBuilder(new HamburgerMealBuilder());
        waiter.prepareMeal();
        Meal hamburger = waiter.getMeal();
        // show hamburger meal set info
        System.out.println("hamburger");
        hamburger.showItems();
        System.out.println("total cost: " + hamburger.getCost() + " yuan");
        // ready to build chicken burger meal
        waiter.setMealBuilder(new ChickenBurgerMealBuilder());
        waiter.prepareMeal();
        Meal chickenBurger = waiter.getMeal();
        // show chicken burger meal set info
        System.out.println("chickenBurger");
        chickenBurger.showItems();
        System.out.println("total cost: " + chickenBurger.getCost() + " yuan");
    }
}
