package mediator;

/**
 * @Title: GroupMemberBase.java
 *
 * @Package mediator
 *
 * @Description: the implementation of GroupMember, defines the solid ops of group members
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public abstract class GroupMemberBase implements GroupMember{

    protected TourGroup tourGroup;

    /**
     * @Description: the implementation of GroupMember, defines the solid ops of group members
     *
     * @param group: the group to join
     */
    @Override
    public void joinTourGroup(TourGroup group) {
        if (group != this.tourGroup) {
            System.out.print("GroupMemberBase:getInstance:("+this.hashCode()+"): ");
            System.out.println(String.format("%s joins the tour group", this));
            this.tourGroup = group;
        }
    }

    /**
     * @Description: Perform an active action
     *
     * @param action: the action to perform
     */
    @Override
    public void groupAction(Action action) {
        System.out.print("GroupMemberBase:getInstance:("+this.hashCode()+"): ");
        System.out.println(String.format("%s %s", this, action.getTeamBehavior()));
    }

    /**
     * @Description: Perform an passive action
     *
     * @param action: the action to perform
     */
    @Override
    public void act(Action action) {
        System.out.print("GroupMemberBase:getInstance:("+this.hashCode()+"): ");
        System.out.println(String.format("%s %s", this, action.getProactiveBehavior()));
        tourGroup.action(this, action);
    }

    /**
     * @Description: override the toString(), to return the class name and member's name
     *
     * @return: the tour group
     */
    @Override
    public abstract String toString();

    /**
     * @Description: return corresponding group
     *
     * @return: corresponding group
     */
    public TourGroup getGroup() {
        return tourGroup;
    }
}
