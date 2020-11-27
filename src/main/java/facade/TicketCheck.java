package facade;

/**
 * @author Nam
 */
public class TicketCheck implements CheckTicket{
    @Override
    public void check() {
        System.out.println("(" + this.toString()+")" + "check: Create entity class that implement the interface." + "Success ticket check!");
    }
}
