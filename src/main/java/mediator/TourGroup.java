package mediator;

/**
 * @Title: TourGroup.java
 *
 * @Package mediator
 *
 * @Description: the interface of Tour Group, which defines the basic ops of group
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public interface TourGroup {

    /**
     * @Description: add a new member to group
     *
     * @param member: member to add
     */
    void addMember(GroupMember member);

    /**
     * @Description: to perform an action as a team
     *
     * @param actor: person who originally come up with the action
     * @param action: the Action(Enum) to perform
     */
    void action(GroupMember actor, Action action);
}
