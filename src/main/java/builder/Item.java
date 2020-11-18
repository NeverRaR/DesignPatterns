package builder;

/*
 * Item entity
 * Inherited by specific item
 * e.g Burger
 * */
public interface Item {
    String name(); // return the name of item
    Packing packing(); // pack the item
    float price(); // return the price of item
}
