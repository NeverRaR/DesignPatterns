package nullobject;
/**
 * @author 1851594王思桐
 */
public interface Ticket {
    String getID();
    String getCustomerID();

    String getInfo();

    public abstract boolean isNull();
    public abstract void buy();

}
