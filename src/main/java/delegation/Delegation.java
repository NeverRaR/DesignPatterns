package delegation;

/**
 * @author Nam
 */
public class Delegation {
    public static void main(String args[]){
        TicketOffice ticketOffice = new TicketOffice();
        ticketOffice.getYear("00001","00001","adult");
        ticketOffice.getYear("00002","00002","child");
        ticketOffice.getYear("00003","00003","baby");
    }
}
