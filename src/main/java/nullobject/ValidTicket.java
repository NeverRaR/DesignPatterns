package nullobject;


public class ValidTicket implements Ticket{
    private String ID;
    private String customerID;
    private String year;

    public ValidTicket(String ID, String customerID, String year){
        this.ID = ID;
        this.customerID = customerID;
        this.year = year;
    }

    public ValidTicket(){
        this("0001","0001","adult");
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public String getCustomerID() {
        return customerID;
    }

    @Override
    public void buy() {
        System.out.println("The visitor " + ID +" is a "+year);
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
