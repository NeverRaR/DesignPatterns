package chainofresponsibility;

/**
 * define ServiceComplaintHandler class, which handles service complaint
 * @author 1853615邓斯语
 */
public class ServiceComplaintHandler extends ComplaintHandler {

    /**
     * constructor
     * @param next
     */
    public ServiceComplaintHandler(ComplaintHandler next) {
        super(next);
    }

    /**
     * check whether the object can handle complaint or not, and change the state of complaint
     * if it is handled, meanwhile print information
     * @param complaint
     */
    public void handleComplaint(Complaint complaint) {
        if (complaint.getComplaintType() == Complaint.ComplaintType.SERVICE) {
            printHandleResult("Service complaint", true);
            complaint.markHandled();
        }
        else {
            super.handleComplaint(complaint);
        }
    }
}
