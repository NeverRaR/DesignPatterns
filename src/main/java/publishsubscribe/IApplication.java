package publishsubscribe;

public interface IApplication {

    public boolean subscribe(ApplicationManager publisher, Vistor subscriber);

    public boolean unsubscribe(ApplicationManager publisher,Vistor subscriber);

    public void publish(ApplicationManager publisher, Information info);
}
