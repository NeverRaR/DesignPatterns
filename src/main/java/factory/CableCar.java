package factory;

/**
 * define CableCar class, which let cable car be built
 * @author 1853615邓斯语
 */
public class CableCar implements Facility {
    /**
     * let cable car be built
     */
    public void build() {
        System.out.println("CableCar: build: Cable car is under construction");
    }
}
