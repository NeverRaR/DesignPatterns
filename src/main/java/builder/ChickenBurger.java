package builder;

/*
 * Chicken burger
 * can be added into meal set
 * or sold alone.
 * */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 18f;
    }
}
