package builder;

/**
 * The interface Item.
 * Inherited by specific item
 */
public interface Item {
    /**
     * Name string.
     *
     * @return the string of current item
     */
    String name();

    /**
     * Packing packing.
     *
     * @return the packing of current item
     */
    Packing packing();

    /**
     * Price float.
     *
     * @return the float of current item
     */
    float price();
}
