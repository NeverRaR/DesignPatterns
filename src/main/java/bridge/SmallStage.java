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
    protected SmallStage(Performance performance) {
        super(performance);
    }

    /**
     * Do perform.
     */
    @Override
    protected void doPerform() {
        System.out.print("This is a small stage. ");
        super.doPerform();
    }
}
