package transferObject;

import org.junit.Test;

/**
 * Test for transferObject
 * @author Nntraveler
 */
public class TransferObjectTest {

    @Test
    public void main() {
        UserBO userBusinessObject = new UserBO();

        userBusinessObject.addUser(new UserVO("Hans", "000E3C"));

        // output all the users
        for(UserVO user:userBusinessObject.getAllUsers()) {
            System.out.println("[TransferObjectTest:main]: user: [ID: "+user.getUserId()+", Name: "+user.getName()+"]");
        }

        // update user
        UserVO user = userBusinessObject.getAllUsers().get(0);
        user.setName("Michael");
        userBusinessObject.deleteUser(user);

        // get user
        user = userBusinessObject.getUser(1);
        System.out.println("[TransferObjectTest:main]: user: [ID: "+user.getUserId()+", Name: "+user.getName()+"]");
        userBusinessObject.deleteUser(user);
    }

}
