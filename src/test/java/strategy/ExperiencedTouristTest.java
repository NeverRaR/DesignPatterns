package strategy;

import junit.framework.TestCase;
import org.junit.Test;

public class ExperiencedTouristTest extends TestCase {
    @Test
    public void test() {
        System.out.println("1# Initial Destination");
        ExperiencedTourist Sam = new ExperiencedTourist(new goToChillingRestaurant());
        System.out.print("ExperiencedTourist:getInstance:("+Sam.hashCode()+"): ");
        System.out.print("Sam: ");
        Sam.goToDestination();
        ExperiencedTourist Jack = new ExperiencedTourist(new goToIceCanyon());
        System.out.print("ExperiencedTourist:getInstance:("+Jack.hashCode()+"): ");
        System.out.print("Jack: ");
        Jack.goToDestination();
        ExperiencedTourist Peter = new ExperiencedTourist(new goToMidHillsideChalet());
        System.out.print("ExperiencedTourist:getInstance:("+Peter.hashCode()+"): ");
        System.out.print("Peter: ");
        Peter.goToDestination();

        System.out.println("\n2# Updated Destination");
        Sam.changeMethod(new goToParadiseExit());
        Jack.changeMethod(new goToParadiseExit());
        Peter.changeMethod(new goToParadiseExit());
        System.out.print("ExperiencedTourist:getInstance:("+Sam.hashCode()+"): ");
        System.out.print("Sam: ");
        Sam.goToDestination();
        System.out.print("ExperiencedTourist:getInstance:("+Jack.hashCode()+"): ");
        System.out.print("Jack: ");
        Jack.goToDestination();
        System.out.print("ExperiencedTourist:getInstance:("+Peter.hashCode()+"): ");
        System.out.print("Peter: ");
        Peter.goToDestination();
    }
}
