package chainofresponsibility;

import junit.framework.TestCase;
import org.junit.Test;

public class ChainTest extends TestCase {

    @Test
    public void test() {
        System.out.println("Test chainofresponsibility pattern:");
        HandleChain chain = new HandleChain();
        //test all kinds of complaint, can be changed
        chain.handle(new Complaint(Complaint.ComplaintType.SERVICE));
        chain.handle(new Complaint(Complaint.ComplaintType.FACILITY));
        chain.handle(new Complaint(Complaint.ComplaintType.ENVIRONMENT));
    }
}
