package builder;

/**
 * The type Juice.
 * can be added into meal set
 * or sold alone.
 */

public class Juice extends Drink{
    /**
     * Name string.
     *
     * @return the string Juice
     */
    @Override
    public String name() {
        return "Juice";
    }

    /**
     * Price float.
     *
     * @return the float of juice
     */
    @Override
    public float price() {
        return 8.0f;
    }
}
