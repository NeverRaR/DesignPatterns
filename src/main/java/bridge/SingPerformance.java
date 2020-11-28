package bridge;

/**
 * The type Sing performance.
 */
public class SingPerformance implements Performance {
    /**
     * Perform singing activity.
     */
    @Override
    public void performActivity() {
        System.out.println("[SingPerformance:" + toString() + ":performActivity]: This stage is holding singing performance!");
    }
}
