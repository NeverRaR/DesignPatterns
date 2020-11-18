package dataaccessobject;

import org.junit.Test;

public class CustomerDaoTest {
    @Test
    public void test(){
        CustomerDao customerDao = new CustomerDaoImpl();
        Customer customer = new Customer(1853401, "Weiqi", "Li");
        System.out.println(customer.getID());
        customerDao.updateCustomer(customer);

    }
}
