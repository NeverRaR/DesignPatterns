package factory;

/**
 * define SkiField class, which let ski field be built
 * @author 1853615邓斯语
 */
public class SkiField implements Facility {

    /**
     * let ski field be built
     */
    public void build() {
        System.out.println("SkiField: (" + hashCode() + "): build: An area of ski field is under construction");
    }
}
