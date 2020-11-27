package delegation;

import nullobject.Ticket;
import nullobject.NullTicket;
import nullobject.ValidTicket;

/**
 * @author Nam
 */
public class TicketOffice {
    private Tourists tourist_1 = new Tourists();
    private Child child_1 = new Child();

    /**
     * Adult ticket.
     * @param year:the age of the ticket buyer.
     */
    private void adultTicket(String year){
        this.tourist_1.buyticket(year);
    }

    /**
     * Child ticket.
     * @param year:the age of the ticket buyer.
     */
    private void childTicket(String year){
        this.child_1.buyticket(year);
    }

    /**
     * Buy a ticket
     * @param ID:the tourist ID
     * @param customerID:the customer ID
     * @param year:the age of the tourist
     * @return ticket message
     */

    public Ticket getYear(String ID,String customerID,String year){
        System.out.println("("+this.toString()+") : "+"getYear: delegate ticket office processing ticket information.");
        Ticket ticket;
        switch (year){
            case "adult":
                ticket = new ValidTicket(ID,customerID,year);
                this.adultTicket(year);
                ticket.buy();
                System.out.println("");
                break;

            case "child":
                ticket = new ValidTicket(ID,customerID,year);
                this.childTicket(year);
                ticket.buy();
                System.out.println("");

                break;
            default:

                ticket = new NullTicket();
                ticket.buy();
                System.out.println("");
                break;
        }
        return ticket;
    }
}
