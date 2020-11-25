package chainofresponsibility;

/**
 * define HandleChain class, which forms the chain to handle complaint
 * @author 1853615邓斯语
 */
public class HandleChain {
    ComplaintHandler chain;

    /**
     * constructor
     */
    public HandleChain() {
        buildChain();
    }

    /**
     * define the handle chain
     */
    private void buildChain() {
        // the definition of "chain" can be changed to get other output info
        chain = new ServiceComplaintHandler(new FacilityComplaintHandler(new EnvironmentComplaintHandler(null)));
    }

    /**
     * let the chain handle complaint
     * @param complaint
     */
    public void handle(Complaint complaint) {
        chain.handleComplaint(complaint);
    }
}
