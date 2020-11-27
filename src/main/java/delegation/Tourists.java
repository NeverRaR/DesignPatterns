package delegation;

/**
 * @author Nam
 */
public class Tourists implements BuyTicket{
    public void buyticket(String ticket){
        /**
         * Tourist buys a ticket, exporting information about the tickets purchased
         */
        System.out.println("buy ticket: The tourist buys : "+ticket);
    }
}