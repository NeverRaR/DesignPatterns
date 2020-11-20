package nullobject;

public class NullTicket implements Ticket{
    @Override
    public String getID() {
        return null;
    }

    @Override
    public String getCustomerID() {
        return null;
    }

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public void buy() {
        System.out.println("("+this.toString()+") : ");
        System.out.println("Wrong message!");
    }
}
