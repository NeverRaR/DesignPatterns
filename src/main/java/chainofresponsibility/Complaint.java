package chainofresponsibility;

import java.util.Objects;

public class Complaint {
    //三种类型的投诉：服务 设备 环境
    public enum ComplaintType {
        SERVICE, FACILITY, ENVIRONMENT
    }
    private ComplaintType complaintType;
    // private String complaintDescription;
    private boolean handled = false;

    public Complaint(ComplaintType complaintType) {
        this.complaintType = Objects.requireNonNull(complaintType);
        // this.complaintDescription = Objects.requireNonNull(complaintDescription);
    }

    // public String getComplaintDescription() { return complaintDescription; }

    public ComplaintType getComplaintType() { return complaintType; }

    public void markHandled() { this.handled = true; }

    public boolean isHandled() { return this.handled; }
}


