package publishsubscribe;

import junit.framework.TestCase;
import org.junit.Test;

public class PublishSubscribeTest extends TestCase {
    @Test
    public void test(){

        System.out.println("PublishSubscribeTest:");

        System.out.println("Creating app...");
        Application app = new Application();
        System.out.println();

        System.out.println("Creating entertainmentController...");
        EntertainmentController entertainmentController = new EntertainmentController(app);
        System.out.println();

        System.out.println("Creating subscriberController...");
        VisitorController subscriberController = new VisitorController(app);
        System.out.println();

        System.out.println("The visitor1 subscribe the Skiing entertainment...");
        subscriberController.subscribe("visitor1","Skiing entertainment");
        System.out.println();

        System.out.println("The visitor2 subscribe the Skiing entertainment...");
        subscriberController.subscribe("visitor2","Skiing entertainment");
        System.out.println();

        System.out.println("The visitor3 subscribe the Ice show...");
        subscriberController.subscribe("visitor3","Ice show");
        System.out.println();

        System.out.println("The Skiing entertainment publishes information:\"Skiing entertainment opening hours are 10:00-17:00.\" to all visitors who subscribe to it...");
        entertainmentController.publish("Skiing entertainment","Skiing entertainment opening hours are 10:00-17:00");
        System.out.println();

        System.out.println("The Ice show releases information:\"There is no ice show today.\" to all visitors who subscribe to it...");
        entertainmentController.publish("Ice show","There is no ice show today.");
        System.out.println();

        System.out.println("The visitor2 unsubscribe the Skiing entertainment...");
        subscriberController.unsubscribe("visitor2","Skiing entertainment");
        System.out.println();

        System.out.println("The Skiing entertainment publishes information:\"Skiing entertainment opening hours are adjusted to 09:00-17:00.\" to all visitors who subscribe to it again...");
        entertainmentController.publish("Skiing entertainment","Skiing entertainment opening hours are adjusted to 09:00-17:00.");
        System.out.println();

        System.out.println("The visitor1 subscribe the Skiing entertainment again...");
        subscriberController.subscribe("visitor1","Skiing entertainment");
        System.out.println();

        System.out.println("The visitor2 unsubscribe the Skiing entertainment again...");
        subscriberController.unsubscribe("visitor2","Skiing entertainment");
    }
}
