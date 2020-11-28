package singleton;

import org.junit.Test;

public class ClockTest {
    @Test
    public void main() {
        Clock clockOutsideTheParadise = Clock.getClock();
        Clock clockAtTheTicketCounter = Clock.getClock();
        Clock clockInTheRestaurant = Clock.getClock();

        System.out.println("1# Functional Test");
        System.out.println("Initial States:");
        System.out.print("clockOutsideTheParadise:getInstance:("+clockOutsideTheParadise.hashCode()+"): ");
        System.out.println("clockOutsideTheParadise's time: "+clockOutsideTheParadise.getTime());
        System.out.print("clockAtTheTicketCounter:getInstance:("+clockAtTheTicketCounter.hashCode()+"): ");
        System.out.println("clockAtTheTicketCounter's time: "+clockAtTheTicketCounter.getTime());
        System.out.print("clockInTheRestaurant:getInstance:("+clockInTheRestaurant.hashCode()+"): ");
        System.out.println("clockInTheRestaurant's time: "+clockInTheRestaurant.getTime());

        clockAtTheTicketCounter.setTime("11:45:14");
        System.out.println("\nUpdated States:");
        System.out.print("clockOutsideTheParadise:getInstance:("+clockOutsideTheParadise.hashCode()+"): ");
        System.out.println("clockOutsideTheParadise's time: "+clockOutsideTheParadise.getTime());
        System.out.print("clockAtTheTicketCounter:getInstance:("+clockAtTheTicketCounter.hashCode()+"): ");
        System.out.println("clockAtTheTicketCounter's time: "+clockAtTheTicketCounter.getTime());
        System.out.print("clockInTheRestaurant:getInstance:("+clockInTheRestaurant.hashCode()+"): ");
        System.out.println("clockInTheRestaurant's time: "+clockInTheRestaurant.getTime());

        System.out.println("\n2# Instance Test");
        if ((clockOutsideTheParadise == clockAtTheTicketCounter)
                & (clockOutsideTheParadise == clockInTheRestaurant)) {
            System.out.println("clockOutsideTheParadise:getInstance:("+clockOutsideTheParadise.hashCode()+")");
            System.out.println("clockAtTheTicketCounter:getInstance:("+clockAtTheTicketCounter.hashCode()+")");
            System.out.println("clockInTheRestaurant:getInstance:("+clockInTheRestaurant.hashCode()+")");
            System.out.println("Three clocks are the same instances.");
        }
    }
}
