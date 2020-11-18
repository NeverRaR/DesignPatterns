package builder;

/*
 * Hamburger
 * can be added into meal set
 * or sold alone.
 * */
public class Hamburger extends Burger {
    @Override
    public String name() {
        return "Hamburger";
    }

    @Override
    public float price() {
        return 16f;
    }
}
