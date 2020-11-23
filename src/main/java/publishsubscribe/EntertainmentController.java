package publishsubscribe;

public class EntertainmentController {
    private Application app;  //订阅发布中心。

    public EntertainmentController(Application app) {
        this.app = app;
    }

    public void publish(String entertainmentName,String info){
        app.publish(new Entertainment(entertainmentName),new Information(info));
    }
}