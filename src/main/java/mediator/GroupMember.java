package mediator;

public interface GroupMember {

    void joinTourGroup(TourGroup group);

    void groupAction(Action action);

    void act(Action action);
}
