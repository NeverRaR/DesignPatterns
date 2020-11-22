package nullobject;

public class Stub implements Ticket{

    String ID;
    String customerID;
    public Stub(String ID,String customerID){
        this.ID = ID;
        this.customerID = customerID;
    }
    public Stub(){
        this("0001","0001");
    }
    @Override
    public String getID() {
        return ID;
    }

    @Override
    public String getCustomerID() {
        return customerID;
    }

    /**
     * show Info of the Stub
     * @return info:String,stitched together from instance information and ID
     */
    @Override
    public String getInfo() {
        return this+":getInfo():"+ID;
    }
}
