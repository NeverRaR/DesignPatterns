package nullobject;

import java.util.ArrayList;

public class TicketFinder {
    private ArrayList<Ticket> TicketDataBase = new ArrayList<Ticket>();

    public TicketFinder(){
        TicketDataBase.add(new ValidTicket("0001","0001"));
        TicketDataBase.add(new ValidTicket("0002","0002"));
        TicketDataBase.add(new ValidTicket("0003","0003"));
    }

    public Ticket Find(Stub s){
        for(int i = 0;i< TicketDataBase.size();i++){
            boolean a = TicketDataBase.get(i).getID().equals(s.getID());
            boolean b = TicketDataBase.get(i).getCustomerID().equals(s.getCustomerID());
            if(a &&b){
                return TicketDataBase.get(i);
            }
        }
        return new NullTicket();
    }
}
