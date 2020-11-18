package builder;

/*
 * Juice
 * can be added into meal set
 * or sold alone.
 * */
public class Juice extends Drink{
    @Override
    public String name() {
        return "Juice";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
