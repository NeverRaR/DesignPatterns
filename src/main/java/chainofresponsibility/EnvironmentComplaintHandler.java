package chainofresponsibility;

public class EnvironmentComplaintHandler extends ComplaintHandler {
    public EnvironmentComplaintHandler(ComplaintHandler next) {
        super(next);
    }

    public void handleComplaint(Complaint complaint) {
        if (complaint.getComplaintType() == Complaint.ComplaintType.ENVIRONMENT) {
            printHandleResult("Environment complaint");
            complaint.markHandled();
        }
        else {
            super.handleComplaint(complaint);
        }
    }
}
