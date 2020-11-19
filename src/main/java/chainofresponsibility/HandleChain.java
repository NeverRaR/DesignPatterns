package chainofresponsibility;

public class HandleChain {
    ComplaintHandler chain;

    public HandleChain() {
        buildChain();
    }

    private void buildChain() {
//        ServiceComplaintHandler service;
//        FacilityComplaintHandler facility;
//        EnvironmentComplaintHandler environment;
        //chain可改变以测试各种结果
        chain = new ServiceComplaintHandler(new FacilityComplaintHandler(new EnvironmentComplaintHandler(null)));
    }

    public void handle(Complaint complaint) {
        chain.handleComplaint(complaint);
    }
}
