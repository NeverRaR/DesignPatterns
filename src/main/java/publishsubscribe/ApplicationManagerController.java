package publishsubscribe;

public class ApplicationManagerController {
    private Application app;  //订阅发布中心。

    public ApplicationManagerController(Application app) {
        this.app = app;
    }

    public void publish(String publisherName,String info){
        app.publish(new ApplicationManager(publisherName),new Information(info));
    }
}
