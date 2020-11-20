package delegation;

import org.junit.Test;

public class DelegationTest {
    @Test
    public void test(){
        System.out.println();
        System.out.println("Testing Delegation");
        TicketOffice ticketOffice = new TicketOffice();
        ticketOffice.getYear("00001","00001","adult");
        ticketOffice.getYear("00002","00002","child");
        ticketOffice.getYear("00003","00003","baby");
    }
}
