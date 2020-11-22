package delegation;

import nullobject.Ticket;
import nullobject.NullTicket;
import nullobject.ValidTicket;

public class TicketOffice {
    private Tourists tourist_1 = new Tourists();
    private Child child_1 = new Child();


    private void adultTicket(String year){
        this.tourist_1.buyticket(year);
    }//成人票
    private void childTicket(String year){
        this.child_1.buyticket(year);
    }//儿童票

    public Ticket getYear(String ID,String customerID,String year){//制作蛋糕返回蛋糕实例
        System.out.println("("+this.toString()+") : ");
        Ticket ticket;
        switch (year){
            case "adult"://成人票
                ticket = new ValidTicket(ID,customerID,year);
                this.adultTicket(year);
                ticket.buy();
                System.out.println("");
                break;

            case "child"://儿童票
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
