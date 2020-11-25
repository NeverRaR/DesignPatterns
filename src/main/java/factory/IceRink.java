package factory;

/**
 * define IceRink class, which let ice rink be built
 * @author 1853615邓斯语
 */
public class IceRink implements Facility {
    /**
     * let ice rink be built
     */
    public void build() {
        System.out.println("IceRink: build: An area of ice rink is under construction");
    }
}
