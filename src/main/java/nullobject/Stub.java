package nullobject;

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
}
