package monostate;

import org.junit.Test;

public class BillboardTest {
    @Test
    public void main(){
        Billboard billboardOutsideTheParadise = new Billboard();
        System.out.println("Initial News on billboardOutsideTheParadise:");
        System.out.println(billboardOutsideTheParadise.getTodayNews());
        Billboard billboardAtTheTicketCounter = new Billboard();
        System.out.println("Initial News on billboardAtTheTicketCounter:");
        System.out.println(billboardAtTheTicketCounter.getTodayNews());
        Billboard billboardInTheRestaurant = new Billboard();
        System.out.println("Initial News on billboardInTheRestaurant:");
        System.out.println(billboardInTheRestaurant.getTodayNews());

        billboardAtTheTicketCounter.setTodayNews("Half price at all recreation facilities today!");

        System.out.println("Updated News on billboardOutsideTheParadise:");
        System.out.println(billboardOutsideTheParadise.getTodayNews());
        System.out.println("Updated News on billboardAtTheTicketCounter:");
        System.out.println(billboardAtTheTicketCounter.getTodayNews());
        System.out.println("Updated News on billboardInTheRestaurant:");
        System.out.println(billboardInTheRestaurant.getTodayNews());
    }
}
