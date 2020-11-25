package chainofresponsibility;

/**
 * define complaintHandler class, which passes the complaint on along the chain
 * @author 1853615邓斯语
 */
public abstract class ComplaintHandler {

    private ComplaintHandler next;

    /**
     * constructor
     * @param next
     */
    public ComplaintHandler(ComplaintHandler next) {
        this.next = next;
    }

    /**
     * pass the complaint on along the chain until it is handled
     * @param complaint
     */
    public void handleComplaint(Complaint complaint) {
        // the chain remains to be traversed and the complaint is not handled
        if ((next != null) && !complaint.isHandled()) {
            next.handleComplaint(complaint);
        }
        // the chain is traversed totally and the complaint is not handled
        if ((next == null) && !complaint.isHandled()) {
            printHandleResult("", false);
        }
    }

    /**
     * print the handle result
     * @param type
     */
    public void printHandleResult(String type, boolean handled) {
        if (handled == true) {
            System.out.println("ComplaintHandler: printHandleResult: " + type + " has been handled now");
        }
        if (handled == false) {
            System.out.println("ComplaintHandler: printHandleResult: Complaint cannot be handled now");
        }
    }
}

