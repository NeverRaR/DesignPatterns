package builder;

/**
 * The type Drink.
 * Inherited by specific drinks
 * e.g Cola
 */
public abstract class Drink implements Item{
    /**
     * packing with cup
     *
     * @return the packing cup
     */
    @Override
    public Packing packing() {
        return new Cup();
    } // use cup to pack drinks
}
