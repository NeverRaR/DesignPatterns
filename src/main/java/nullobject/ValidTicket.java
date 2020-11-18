package nullobject;


class ValidTicket implements Ticket{
    private String ID;
    private String customerID;

    public ValidTicket(String ID, String customerID){
        this.ID = ID;
        this.customerID = customerID;
    }
    public ValidTicket(){
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
}
