package nullobject;
/**
 * @author 1851594王思桐
 */
public class Stub {

    String ID;
    String customerID;
    public Stub(String ID,String customerID){
        this.ID = ID;
        this.customerID = customerID;
    }
    public Stub(){
        this("0001","0001");
    }

    public String getID() {
        return ID;
    }

    public String getCustomerID() {
        return customerID;
    }

    /**
     * show Info of the Stub
     * @return info:String,stitched together from instance information and ID
     */
    public String getInfo() {
        return this+":getInfo():"+ID;
    }
}
