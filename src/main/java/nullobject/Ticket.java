package nullobject;

public interface Ticket {
    String getID();
    String getCustomerID();
    String getInfo();

    public abstract boolean isNull();
    public abstract void buy();
}
