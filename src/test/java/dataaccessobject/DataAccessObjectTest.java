package dataaccessobject;

import junit.framework.TestCase;
import org.junit.Test;

public class DataAccessObjectTest extends TestCase {
    @Test
    public void test(){
        CustomerDao customerDao = new CustomerDaoImpl();
        Customer customer = new Customer(1853401, "Weiqi", "Li");
        customerDao.updateCustomer(customer);
        customerDao.getCustomer();
    }
}
