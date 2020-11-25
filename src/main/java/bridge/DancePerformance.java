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
        System.out.println("[DancePerformance:" + toString() + ":performActivity]: This stage is holding dancing performance!");
    }
}
