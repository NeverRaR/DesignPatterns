package nullobject;

public interface Ticket {
    String getID();
    String getCustomerID();
    public abstract boolean isNull();
    public abstract void buy();
}
