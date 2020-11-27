package publishsubscribe;

public class VisitorController {
    private Application app;

    /**
     * The constructor of VisitorController.
     * @param app: Application class object that will be used.
     */
    public VisitorController(Application app) {
        this.app = app;
        System.out.println(this.getClass().getSimpleName()+":("+this.hashCode()+"):VisitorController():creat VisitorController object successfully.");
    }

    /**
     * Send a subscription request to the application class.
     * @param visitorName: the name of the visitor who subscribed to the entertainment.
     * @param entertainmentName: the name of entertainment to be subscribed.
     */
    public void subscribe(String visitorName,String entertainmentName){

        System.out.println(this.getClass().getSimpleName()+":("+
                this.hashCode()+"):subscribe():"+
                "visitorController send a subscription request to the application class.");

        app.subscribe(new Entertainment(entertainmentName),new Visitor(visitorName));
    }

    /**
     * Send a unsubscription request to the application class.
     * @param visitorName: the name of the visitor who unsubscribed to the entertainment..
     * @param entertainmentName: the name of entertainment to be unsubscribed.
     */
    public void unsubscribe(String visitorName,String entertainmentName){

        System.out.println(this.getClass().getSimpleName()+":("+
                this.hashCode()+"):subscribe():"+
                "visitorController send a unsubscription request to the application class.");

        app.unsubscribe(new Entertainment(entertainmentName),new Visitor(visitorName));

    }

}
