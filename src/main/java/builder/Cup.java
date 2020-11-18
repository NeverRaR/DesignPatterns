package builder;

/*
 * Pack drinks
 * e.g Cola
 * */
public class Cup implements Packing{

    @Override
    public String pack() {
        return "Cup";
    }
}
