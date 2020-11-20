package facade;

public class TicketCheck implements CheckTicket{
    @Override
    public void check() {
        System.out.println("Successful ticket check!");
    }
}
