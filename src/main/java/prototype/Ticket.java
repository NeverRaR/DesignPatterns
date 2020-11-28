package prototype;

/**
 * @author 1754025徐菡志
 */

public class Ticket extends TicketCloneable{

    /**
     * The constructor of Ticket Class.
     * @param price：the price of ticket.
     * @param date：the date of ticket that can be used.
     * @param type: the type of ticket.
     */
    public Ticket(double price,String date,String type){
        this.price=price;
        this.date=date;
        this.type=type;
        if(this.giftticket!=null){
            System.out.println(getClass().getSimpleName() +
                    ":(" +
                    this.hashCode()+
                    "):Ticket():create ticket" +
                    "{" +
                    "price=" + price +
                    ", date='" + date + '\'' +
                    ", type='" + type + '\'' +
                    ", giftticket.hashcode=" +
                    this.giftticket.hashCode() +
                    "} successfully.");
        }
        else{
            System.out.println(getClass().getSimpleName() +
                    ":(" +
                    this.hashCode()+
                    "):Ticket():create ticket" +
                    "{" +
                    "price=" + price +
                    ", date='" + date + '\'' +
                    ", type='" + type + '\'' +
                    "} successfully.");
        }
    }

    /**
     * @return formatted ticket information.
     */
    public String getFormattedInfo() {

        if(this.giftticket!=null){
            return
                    getClass().getSimpleName()+
                            ":(" +
                            this.hashCode()+
                            "):getFormattedInfo():ticket"+
                            "{" +
                            "price=" + price +
                            ", date='" + date + '\'' +
                            ", type='" + type + '\'' +
                            ", giftticket.hashcode=" +
                            this.giftticket.hashCode()+
                            "}.";
        }
        else{
            return
                    getClass().getSimpleName()+
                            " " +
                            this.hashCode()+
                            ": getFormattedInfo():ticket"+
                            "{" +
                            "price=" + price +
                            ", date='" + date + '\'' +
                            ", type='" + type + '\'' +
                            "}.";
        }
    }

    /**
     * @return the basic information of ticket.
     */
    public String getInfo() {

        if(this.giftticket!=null){
            return
                    "ticket"+
                            "{" +
                            "price=" + price +
                            ", date='" + date + '\'' +
                            ", type='" + type + '\'' +
                            ", giftticket.hashcode=" +
                            this.giftticket.hashCode()+
                            "}.";
        }
        else{
            return
                    "ticket"+
                            ": {" +
                            "price=" + price +
                            ", date='" + date + '\'' +
                            ", type='" + type + '\'' +
                            "}.";
        }
    }
}
