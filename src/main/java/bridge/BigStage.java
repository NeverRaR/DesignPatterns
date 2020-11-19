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
    protected BigStage(Performance performance) {
        super(performance);
    }

    /**
     * Do perform.
     */
    @Override
    protected void doPerform() {
        System.out.print("This is a big stage. ");
        super.doPerform();
    }
}
