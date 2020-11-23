package prototype;

import junit.framework.TestCase;
import org.junit.Test;

public class PrototypeTest extends TestCase {
    @Test
    public void test(){

        System.out.println("PrototypeTest:");

        System.out.println("Creating tickets...");
        Ticket ticket = new Ticket(30,"2020-11-23","AdultTicket");
        ticket.giftticket = new Ticket(0,"2020-11-23","GiftTicket");
        System.out.println();

        System.out.println("Shallow Copy...");
        Ticket ticket1 = (Ticket)ticket.clone();
        Ticket ticket2 = (Ticket)ticket.clone();
        System.out.println();

        System.out.println("Check shallow copy object:");
        System.out.println(ticket1.getFormattedInfo());
        System.out.println(ticket2.getFormattedInfo());
        System.out.println();

        System.out.println("Deep Copy...");
        Ticket ticket3 = (Ticket)ticket.deepClone();
        System.out.println();

        System.out.println("Check deep copy object:");
        System.out.println(ticket3.getFormattedInfo());

    }

}
