package dataaccessobject;

/**
 * Interface of data access object
 */
public interface CustomerDao {
    /**
     * Get information of the customer
     * @return Customer
     */
    public Customer getCustomer();

    /**
     * Update information of the customer
     * @param customer the given customer information
     * @return whether the customer is successfully updated
     */
    public boolean updateCustomer(Customer customer);
}
