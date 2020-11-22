package strategy;

import org.junit.Test;

public class ExperiencedTouristTest {
    @Test
    public void main() {
        ExperiencedTourist Sam = new ExperiencedTourist(new goToChillingRestaurant());
        System.out.print("Sam: ");
        Sam.goToDestination();
        ExperiencedTourist Jack = new ExperiencedTourist(new goToIceCanyon());
        System.out.print("Jack: ");
        Jack.goToDestination();
        ExperiencedTourist Peter = new ExperiencedTourist(new goToMidHillsideChalet());
        System.out.print("Peter: ");
        Peter.goToDestination();

        Sam.changeMethod(new goToParadiseExit());
        Jack.changeMethod(new goToParadiseExit());
        Peter.changeMethod(new goToParadiseExit());
        System.out.print("Sam: ");
        Sam.goToDestination();
        System.out.print("Jack: ");
        Jack.goToDestination();
        System.out.print("Peter: ");
        Peter.goToDestination();
    }
}
