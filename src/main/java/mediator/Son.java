package mediator;

public class Son extends GroupMemberBase{

    private String name;

    public Son(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Son(%s)", this.name);
    }

}
