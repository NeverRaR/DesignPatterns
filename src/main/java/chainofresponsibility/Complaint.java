package chainofresponsibility;

import java.util.Objects;

/**
 * define complaint class, including type and state
 * @author 1853615邓斯语
 */
public class Complaint {

    // three types of complaint
    public enum ComplaintType {
        SERVICE, FACILITY, ENVIRONMENT
    }
    private ComplaintType complaintType;
    private boolean handled = false;

    /**
     * constructor
     * @param complaintType
     */
    public Complaint(ComplaintType complaintType) {
        this.complaintType = Objects.requireNonNull(complaintType);
    }

    /**
     * @return the type of complaint
     */
    public ComplaintType getComplaintType() { return complaintType; }

    /**
     * change the state of complaint to handled
     */
    public void markHandled() { this.handled = true; }

    /**
     * @return the state of complaint
     */
    public boolean isHandled() { return this.handled; }
}


