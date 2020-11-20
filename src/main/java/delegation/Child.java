package delegation;

public class Child implements BuyTicket{
    @Override
    public void buyticket(String childTicket){
        System.out.println("The child tourist buys: "+childTicket);
    }
}
