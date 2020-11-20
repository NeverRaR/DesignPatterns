package publishsubscribe;

public class VistorController {
    private Application app;

    public VistorController(Application app) {
        this.app = app;
    }

    public void subscribe(String vistorName,String entertainmentName){
        System.out.println(app.subscribe(new Entertainment(entertainmentName),new Vistor(vistorName)));
    }

    public void unsubscribe(String vistorName,String entertainmentName){
        System.out.println(app.unsubscribe(new Entertainment(entertainmentName),new Vistor(vistorName)));
    }

}
