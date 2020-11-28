package monostate;

import org.junit.Test;

public class BillboardTest {
    @Test
    public void main(){
        System.out.println("1# Initial News");
        Billboard billboardOutsideTheParadise = new Billboard();
        System.out.print("billboardOutsideTheParadise:getInstance:("+billboardOutsideTheParadise.hashCode()+"): ");
        System.out.println("Initial News on billboardOutsideTheParadise:");
        System.out.println(billboardOutsideTheParadise.getTodayNews());
        Billboard billboardAtTheTicketCounter = new Billboard();
        System.out.print("billboardOutsideTheParadise:getInstance:("+billboardAtTheTicketCounter.hashCode()+"): ");
        System.out.println("Initial News on billboardAtTheTicketCounter:");
        System.out.println(billboardAtTheTicketCounter.getTodayNews());
        Billboard billboardInTheRestaurant = new Billboard();
        System.out.print("billboardOutsideTheParadise:getInstance:("+billboardInTheRestaurant.hashCode()+"): ");
        System.out.println("Initial News on billboardInTheRestaurant:");
        System.out.println(billboardInTheRestaurant.getTodayNews());

        System.out.println("\n2# Updated News");
        billboardAtTheTicketCounter.setTodayNews("Half price at all recreation facilities today!");

        System.out.print("billboardOutsideTheParadise:getInstance:("+billboardOutsideTheParadise.hashCode()+"): ");
        System.out.println("Updated News on billboardOutsideTheParadise:");
        System.out.println(billboardOutsideTheParadise.getTodayNews());
        System.out.print("billboardOutsideTheParadise:getInstance:("+billboardAtTheTicketCounter.hashCode()+"): ");
        System.out.println("Updated News on billboardAtTheTicketCounter:");
        System.out.println(billboardAtTheTicketCounter.getTodayNews());
        System.out.print("billboardOutsideTheParadise:getInstance:("+billboardInTheRestaurant.hashCode()+"): ");
        System.out.println("Updated News on billboardInTheRestaurant:");
        System.out.println(billboardInTheRestaurant.getTodayNews());
    }
}
