package chainofresponsibility;

/**
 * define EnvironmentComplaintHandler class, which handles environment complaint
 * @author 1853615邓斯语
 */
public class EnvironmentComplaintHandler extends ComplaintHandler {
    /**
     * constructor
     * @param next
     */
    public EnvironmentComplaintHandler(ComplaintHandler next) {
        super(next);
    }

    /**
     * check whether the object can handle complaint or not, and change the state of complaint
     * if it is handled, meanwhile print information
     * @param complaint
     */
    public void handleComplaint(Complaint complaint) {
        if (complaint.getComplaintType() == Complaint.ComplaintType.ENVIRONMENT) {
            printHandleResult("Environment complaint", true);
            complaint.markHandled();
        }
        else {
            super.handleComplaint(complaint);
        }
    }
}
