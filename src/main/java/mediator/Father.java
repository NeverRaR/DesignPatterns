package mediator;

public class Father extends GroupMemberBase{

    private String name;

    public Father(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Father(%s)", this.name);
    }

}
