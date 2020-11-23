package frontcontroller;

import junit.framework.TestCase;
import org.junit.Test;

public class FrontControllerTest extends TestCase {
    @Test
    public void test(){
        System.out.println("FrontController:");
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME", "Jack");
        frontController.dispatchRequest("HOME", "admin");
        frontController.dispatchRequest("PLAYER", "Jack");
        frontController.dispatchRequest("PLAYER", "Admin");
    }
}
