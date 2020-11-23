package nullobject;

import java.util.ArrayList;
/**
 * @author 1851594王思桐
 */
public class TicketFinder {
    /**
     * Emulate a Ticket Database
     */
    private ArrayList<Ticket> TicketDataBase = new ArrayList<Ticket>();

    /**
     * Add three default Tickets into DataBase
     */
    public TicketFinder(){
        TicketDataBase.add(new ValidTicket("0001","0001","adult"));
        TicketDataBase.add(new ValidTicket("0002","0002","adult"));
        TicketDataBase.add(new ValidTicket("0003","0003","adult"));
    }

    /**
     * Find Ticket in DataBase with a Stub
     * @param s:Stub the stub belongs to customer
     * @return ValidTicket if there is a corresponding ticket in database
     *          NullTicket if not.
     */
    public Ticket Find(Stub s){
        for(int i = 0;i< TicketDataBase.size();i++){
            boolean a = TicketDataBase.get(i).getID().equals(s.getID());
            boolean b = TicketDataBase.get(i).getCustomerID().equals(s.getCustomerID());
            if(a && b){
                return TicketDataBase.get(i);
            }
        }
        return new NullTicket();
    }
}
