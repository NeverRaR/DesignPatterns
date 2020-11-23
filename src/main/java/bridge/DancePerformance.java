package bridge;

/**
 * The type Dance performance.
 */
public class DancePerformance implements Performance {
    /**
     * Perform dancing activity.
     */
    @Override
    public void performActivity() {
        System.out.println("[DancePerformance:performActivity]: This stage is holding dancing performance!");
    }
}
