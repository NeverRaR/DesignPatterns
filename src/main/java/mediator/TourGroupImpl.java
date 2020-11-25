package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: TourGroupImpl.java
 * 
 * @Package mediator
 * 
 * @Description: The implementation of TourGroup
 * 
 * @author Jiajie
 * 
 * @date 2020/11/21
 */
public class TourGroupImpl implements TourGroup{

    private final List<GroupMember> members;

    public TourGroupImpl() {
        members = new ArrayList<>();
    }

    /**
     * @Description: Add new member to the tour group
     *
     * @param member: the new members to be added soon
     */
    @Override
    public void addMember(GroupMember member) {
        members.add(member);
        member.joinTourGroup(this);
    }

    /**
     * @Description: Other members of the tour group need to respond together.
     *
     * @param actor: The member who takes the initiative for the action
     * @param action The proposed action
     */
    @Override
    public void action(GroupMember actor, Action action) {
        for (GroupMember member : members) {
            if (!member.equals(actor)) {
                member.groupAction(action);
            }
        }
    }


}
