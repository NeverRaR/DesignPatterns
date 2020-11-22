package publishsubscribe;

public interface IApplication {

    public String subscribe(Entertainment entertainment, Vistor vistor);

    public String unsubscribe(Entertainment entertainment, Vistor vistor);

    public void publish(Entertainment entertainment, Information info);
}
