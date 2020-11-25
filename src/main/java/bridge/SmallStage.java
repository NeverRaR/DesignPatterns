package bridge;

/**
 * The type Small stage.
 */
public class SmallStage extends Stage {
    /**
     * Instantiates a new Small stage.
     *
     * @param performance the performance
     */
    public SmallStage(Performance performance) {
        super(performance);
    }

    /**
     * Do perform.
     */
    @Override
    public void doPerform() {
        System.out.println("[SmallStage:" + toString() + ":doPerform]: This is a small stage. ");
        super.doPerform();
    }
}
