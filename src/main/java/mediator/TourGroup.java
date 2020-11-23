package mediator;

public interface TourGroup {

    void addMember(GroupMember member);

    void action(GroupMember actor, Action action);
}
