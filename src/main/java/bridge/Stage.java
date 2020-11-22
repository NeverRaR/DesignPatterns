package bridge;

/**
 * The type Stage.
 * able to perform a activity
 */
public class Stage {
    private Performance performance;

    /**
     * Instantiates a new Stage.
     *
     * @param performance the performance
     */
    protected Stage(Performance performance){
        this.performance = performance;
    }

    /**
     * Do perform.
     */
    protected void doPerform(){
        performance.performActivity();
    }

    /**
     * Modify activity.
     *
     * @param newPerformance the new performance
     */
    public void modifyActivity(Performance newPerformance){
        this.performance = newPerformance;
    }
}
