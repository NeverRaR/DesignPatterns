package facade;

/**
 * @author Nam
 */
public class CheckPoint {
    private CheckTicket checkticket;

    public CheckPoint() {
        checkticket = new TicketCheck();
        System.out.println("(" + this.toString()+")" + "CheckPoint: Create an appearance class.Start checking ticket!");
    }

    public void toCheck(){
        checkticket.check();
    }
}
