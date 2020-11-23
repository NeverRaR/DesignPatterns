package publishsubscribe;

/**
 * @author 1754025徐菡志
 */

public class EntertainmentController {
    private Application app;

    /**
     * The constructor of EntertainmentController Class.
     */
    public EntertainmentController(Application app) {
        this.app = app;
        System.out.println(this.getClass().getSimpleName()+":("+this.hashCode()+"):EntertainmentController():create the object of EntertainmentController successfully.");
    }

    /**
     * Send a publish request to the application class.
     * @param entertainmentName: the name of entertainment which will publish information.
     * @param info: the information to be published.
     */
    public void publish(String entertainmentName,String info){
        System.out.println(this.getClass().getSimpleName()+":("+this.hashCode()+"):publish():send a publish request to the application class.");
        app.publish(new Entertainment(entertainmentName),new Information(info));
    }
}