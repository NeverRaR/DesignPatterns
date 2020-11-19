package builder;

/**
 * The type Burger.
 * Inherited by specific burgers
 */
public abstract class Burger implements Item{
    /**
     * use wrapper to pack burger
     *
     * @return the Wrapper packing
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    } //
}
