package mediator;

public class Mother extends GroupMemberBase{

    private String name;

    public Mother(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Mother(%s)", this.name);
    }

}