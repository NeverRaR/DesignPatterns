package dataaccessobject;



public interface CustomerDao {
    public Customer getCustomer();

    public boolean updateCustomer(Customer customer);
}
