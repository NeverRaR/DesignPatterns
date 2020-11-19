package chainofresponsibility;

public abstract class ComplaintHandler {
    private ComplaintHandler next;

    public ComplaintHandler(ComplaintHandler next) {
        this.next = next;
    }

    public void handleComplaint(Complaint complaint) {
        //职责链还未遍历完毕且投诉未解决
        if ((next != null) && !complaint.isHandled()) {
            next.handleComplaint(complaint);
        }
        //职责链遍历完毕且投诉未解决
        if ((next == null) && !complaint.isHandled()) {
            System.out.println("Complaint cannot be handled now");
        }
    }

    public void printHandleResult(String type) {
        System.out.println(type + " has been handled now");
    }
}

