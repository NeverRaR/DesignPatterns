package mediator;

public class TourGuides extends GroupMemberBase{

    private String name;

    public TourGuides(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("TourGuides(%s)", this.name);
    }

}