package builder;

/**
 * The type Chicken burger.
 * can be added into meal set
 * or sold alone.
 */
public class ChickenBurger extends Burger{
    /**
     * Name string.
     *
     * @return the string ChickenBurger
     */
    @Override
    public String name() {
        return "ChickenBurger";
    }

    /**
     * Price float.
     *
     * @return the price of chicken burger
     */
    @Override
    public float price() {
        return 18f;
    }
}
