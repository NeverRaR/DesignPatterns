package chainofresponsibility;

import junit.framework.TestCase;
import org.junit.Test;

public class ChainTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Test chainofresponsibility:");
        HandleChain chain = new HandleChain();
        //三种投诉都测试一次
        chain.handle(new Complaint(Complaint.ComplaintType.SERVICE));
        chain.handle(new Complaint(Complaint.ComplaintType.FACILITY));
        chain.handle(new Complaint(Complaint.ComplaintType.ENVIRONMENT));
    }
}
