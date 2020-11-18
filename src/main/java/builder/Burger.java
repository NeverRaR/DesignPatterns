package builder;

/*
 * Burger item
 * Inherited by specific burgers
 * e.g Hamburger
 * */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    } // use wrapper to pack burger
}
