package strategy;

import org.junit.Test;

public class ExperiencedTouristTest {
    @Test
    public void main() {
        ExperiencedTourist Sam = new ExperiencedTourist(new goToChillingRestaurant());
        System.out.print("ExperiencedTourist:getInstance:("+Sam.toString()+"): ");
        System.out.print("Sam: ");
        Sam.goToDestination();
        ExperiencedTourist Jack = new ExperiencedTourist(new goToIceCanyon());
        System.out.print("ExperiencedTourist:getInstance:("+Jack.toString()+"): ");
        System.out.print("Jack: ");
        Jack.goToDestination();
        ExperiencedTourist Peter = new ExperiencedTourist(new goToMidHillsideChalet());
        System.out.print("ExperiencedTourist:getInstance:("+Peter.toString()+"): ");
        System.out.print("Peter: ");
        Peter.goToDestination();

        Sam.changeMethod(new goToParadiseExit());
        Jack.changeMethod(new goToParadiseExit());
        Peter.changeMethod(new goToParadiseExit());
        System.out.print("ExperiencedTourist:getInstance:("+Sam.toString()+"): ");
        System.out.print("Sam: ");
        Sam.goToDestination();
        System.out.print("ExperiencedTourist:getInstance:("+Jack.toString()+"): ");
        System.out.print("Jack: ");
        Jack.goToDestination();
        System.out.print("ExperiencedTourist:getInstance:("+Peter.toString()+"): ");
        System.out.print("Peter: ");
        Peter.goToDestination();
    }
}
