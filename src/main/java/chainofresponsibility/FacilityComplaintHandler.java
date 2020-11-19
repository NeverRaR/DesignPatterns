package chainofresponsibility;

public class FacilityComplaintHandler extends ComplaintHandler {
    public FacilityComplaintHandler(ComplaintHandler next) {
        super(next);
    }

    public void handleComplaint(Complaint complaint) {
        if (complaint.getComplaintType() == Complaint.ComplaintType.FACILITY) {
            printHandleResult("Facility complaint");
            complaint.markHandled();
        }
        else {
            super.handleComplaint(complaint);
        }
    }
}
