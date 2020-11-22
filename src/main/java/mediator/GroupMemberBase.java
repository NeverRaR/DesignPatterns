package mediator;

public abstract class GroupMemberBase implements GroupMember{

    protected TourGroup tourGroup;

    @Override
    public void joinTourGroup(TourGroup group) {
        if (group != this.tourGroup) {
            System.out.println(String.format("%s joins the tour group", this));
            this.tourGroup = group;
        }
    }

    @Override
    public void groupAction(Action action) {
        System.out.println(String.format("%s %s", this, action.getTeamBehavior()));
    }

    @Override
    public void act(Action action) {
        System.out.println(String.format("%s %s", this, action.getProactiveBehavior()));
        tourGroup.action(this, action);
    }

    @Override
    public abstract String toString();

    public TourGroup getGroup() {
        return tourGroup;
    }
}
