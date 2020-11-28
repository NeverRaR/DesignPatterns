package mediator;

import junit.framework.TestCase;
import org.junit.Test;

public class MediatorTest extends TestCase {

    @Test
    public void test() {
        GroupMember son = new Son("Jack");
        GroupMember son2 = new Son("Sam");
        GroupMember mother = new Mother("Alice");
        GroupMember father = new Father("Peter");
        TourGroup tourGroup = new TourGroupImpl();

        System.out.println("1# Members join the group");
        tourGroup.addMember(son);
        tourGroup.addMember(son2);
        tourGroup.addMember(mother);
        tourGroup.addMember(father);

        System.out.println("\n2# Members want to go to toilet");
        son.act(Action.TOILET);

        System.out.println("\n3# Tour Guide joins the group");
        GroupMember tourGuide = new TourGuides("John");
        tourGroup.addMember(tourGuide);
        tourGuide.act(Action.WANDER);

        System.out.println("\n4# Tour Guide starts to lead a tour");
        tourGuide.act(Action.TOUR);

        System.out.println("\n5# Go for a dog sled");
        mother.act(Action.SLED);
    }

}
