package builder;

/**
 * The type Cola.
 * can be added into meal set
 * or sold alone.
 */
public class Cola extends Drink{
    /**
     * Name string.
     *
     * @return the string Cola
     */
    @Override
    public String name() {
        return "Cola";
    }

    /**
     * Price float.
     *
     * @return the price of Cola
     */
    @Override
    public float price() {
        return 5.0f;
    }
}
