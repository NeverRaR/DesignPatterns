package nullobject;

class NullTicket implements Ticket{
    @Override
    public String getID() {
        return null;
    }

    @Override
    public String getCustomerID() {
        return null;
    }
}
