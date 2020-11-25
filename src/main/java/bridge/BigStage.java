package bridge;

/**
 * The type Big stage.
 */
public class BigStage extends Stage{
    /**
     * Instantiates a new Big stage.
     *
     * @param performance the performance
     */
    public BigStage(Performance performance) {
        super(performance);
    }

    /**
     * Do perform.
     */
    @Override
    public void doPerform() {
        System.out.println("[BigStage:" + toString() +":doPerform]: This is a big stage. ");
        super.doPerform();
    }
}
