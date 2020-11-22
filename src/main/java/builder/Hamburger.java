package builder;

/**
 * The type Hamburger.
 * can be added into meal set
 * or sold alone.
 */
public class Hamburger extends Burger {
    /**
     * Name string.
     *
     * @return the string Hamburger
     */
    @Override
    public String name() {
        return "Hamburger";
    }

    /**
     * Price float.
     *
     * @return the price of hamburger
     */
    @Override
    public float price() {
        return 16f;
    }
}
