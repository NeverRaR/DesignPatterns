package mediator;
/**
 * @Title: GroupMember.java
 *
 * @Package mediator
 *
 * @Description: interface GroupMember, defined three basic operations of group member
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public interface GroupMember {

    /**
     * @Description: let a group member join a group
     *
     * @param group: the group to join
     */
    void joinTourGroup(TourGroup group);

    /**
     * @Description: Perform an active action
     *
     * @param action: the action to perform
     */
    void groupAction(Action action);

    /**
     * @Description: Perform a passive action
     *
     * @param action: the action to perform
     */
    void act(Action action);
}
