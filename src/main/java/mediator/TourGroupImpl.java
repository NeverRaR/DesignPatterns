package mediator;

import java.util.ArrayList;
import java.util.List;

public class TourGroupImpl implements TourGroup{

    private final List<GroupMember> members;

    public TourGroupImpl() {
        members = new ArrayList<>();
    }

    @Override
    public void addMember(GroupMember member) {
        members.add(member);
        member.joinTourGroup(this);
    }

    @Override
    public void action(GroupMember actor, Action action) {
        for (GroupMember member : members) {
            if (!member.equals(actor)) {
                member.groupAction(action);
            }
        }
    }


}
