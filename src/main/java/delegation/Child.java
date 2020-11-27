package delegation;

/**
 * @author Nam
 */
public class Child implements BuyTicket{
    @Override
    public void buyticket(String childTicket){
        System.out.println("Child: The child tourist buys: "+childTicket);
    }
}
