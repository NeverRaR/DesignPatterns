package builder;

/*
 * Drinks item
 * Inherited by specific drinks
 * e.g Cola
 * */
public abstract class Drink implements Item{
    @Override
    public Packing packing() {
        return new Cup();
    } // use cup to pack drinks
}
