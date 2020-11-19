package chainofresponsibility;

public class ServiceComplaintHandler extends ComplaintHandler {
    public ServiceComplaintHandler(ComplaintHandler next) {
        super(next);
    }

    public void handleComplaint(Complaint complaint) {
        if (complaint.getComplaintType() == Complaint.ComplaintType.SERVICE) {
            printHandleResult("Service complaint");
            complaint.markHandled();
        }
        else {
            super.handleComplaint(complaint);
        }
    }
}
