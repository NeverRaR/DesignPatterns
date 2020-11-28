package publishsubscribe;

/**
 * @author 1754025徐菡志
 */

public interface IApplication {

    public void subscribe(Entertainment entertainment, Visitor vistor);

    public void unsubscribe(Entertainment entertainment, Visitor vistor);

    public void publish(Entertainment entertainment, Information info);
}
