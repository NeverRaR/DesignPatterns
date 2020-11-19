package factory;

public class BuildFacility {
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
//        else {
//            return
//        }
        System.out.println("This kind of facility does not supported to be built now");
        return null;
    }
}
