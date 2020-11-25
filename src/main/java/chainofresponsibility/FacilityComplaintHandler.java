package chainofresponsibility;

/**
 * define FacilityComplaintHandler class, which handles facility complaint
 * @author 1853615邓斯语
 */
public class FacilityComplaintHandler extends ComplaintHandler {
    /**
     * constructor
     * @param next
     */
    public FacilityComplaintHandler(ComplaintHandler next) {
        super(next);
    }

    /**
     * check whether the object can handle complaint or not, and change the state of complaint
     * if it is handled, meanwhile print information
     * @param complaint
     */
    public void handleComplaint(Complaint complaint) {
        if (complaint.getComplaintType() == Complaint.ComplaintType.FACILITY) {
            printHandleResult("Facility complaint", true);
            complaint.markHandled();
        }
        else {
            super.handleComplaint(complaint);
        }
    }
}
