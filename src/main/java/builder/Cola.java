package builder;

/*
 * Cola
 * can be added into meal set
 * or sold alone.
 * */
public class Cola extends Drink{
    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
