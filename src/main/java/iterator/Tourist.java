package iterator;

public class Tourist {

    private TouristType type;
    private final String name;

    public Tourist(TouristType type, String name) {
        this.name  = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    public TouristType getType() {
        return type;
    }

    public final void setType(TouristType type) {
        this.type = type;
    }
}
