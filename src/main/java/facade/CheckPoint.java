package facade;

public class CheckPoint {
    private CheckTicket checkticket;

    public CheckPoint() {
        checkticket = new TicketCheck();
    }

    public void toCheck(){
        checkticket.check();
    }
}
