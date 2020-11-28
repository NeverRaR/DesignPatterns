package nullobject;

/**
 * @author 1851594王思桐
 */
public class NullTicket implements Ticket{
    /**
     * show Info of the NullTicket
     * @return info:String, information of the instance
     */
    @Override
    public String getInfo() {
        return "NullTicket:("+this.hashCode()+"):getInfo():"+"Invalid Ticket!";
    }

    /**
     * return null when calling this method
     * @return null
     */

    @Override
    public String getID() {
        return null;
    }

    /**
     * return null when calling this method
     * @return null
     */
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
