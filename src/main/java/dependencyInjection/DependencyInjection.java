package dependencyInjection;

/**
 * @author Nam
 */
public class DependencyInjection {
    /**
     * Tourists play different amusement projects through an interface.
     */
    public static void test() {
        System.out.println("\nTourist play different amusement projects through an interface.\n" );
        Tourist tourist = new Tourist();
        tourist.tourist(new SnowBowling());
        tourist.tourist(new SnowMobile());
    }
}
