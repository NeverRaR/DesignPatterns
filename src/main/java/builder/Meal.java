package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Meal.
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    /**
     * Add item.
     *
     * @param item the item to be added
     */
    public void addItem(Item item){
        items.add(item);
    }

    /**
     * Get cost float.
     *
     * @return the total cost
     */
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * Show all items inside.
     */
    public void showItems(){
        for (Item item : items) {
            System.out.print("[Meal:showItems]: Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price() + " yuan");
        }
    }
}
