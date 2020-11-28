package factory;

/**
 * define BuildFacility class, which return new facility
 * @author 1853615邓斯语
 */
public class BuildFacility {

    /**
     * @param name
     * @return different instance or null according to given name
     */
    public Facility build(String name) {
        if(name == null) {
            return null;
        }
        if(name == "ice rink") {
            return new IceRink();
        }
        else if(name == "ski field") {
            return new SkiField();
        }
        else if(name == "cable car") {
            return new CableCar();
        }
        System.out.println("BuildFacility: (" + hashCode() + "): This kind of facility does not supported to be built now");
        return null;
    }
}
