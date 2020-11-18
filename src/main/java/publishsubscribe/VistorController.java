package publishsubscribe;

public class VistorController {
    private Application app;

    public VistorController(Application app) {
        this.app = app;
    }

    public void subscribe(String subscriberName,String publisherName){
        app.subscribe(new ApplicationManager(publisherName),new Vistor(subscriberName));
        System.out.println(subscriberName+"已订阅了来自"+publisherName+"的消息");
    }

    public void unsubscribe(String subscriberName,String publisherName){
        app.unsubscribe(new ApplicationManager(publisherName),new Vistor(subscriberName));
        System.out.println(subscriberName+"已取消订阅了来自"+publisherName+"的消息");
    }

}
