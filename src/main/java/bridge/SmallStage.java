package bridge;

public class SmallStage extends Stage {
    protected SmallStage(Performance performance) {
        super(performance);
    }

    @Override
    protected void doPerform() {
        System.out.print("This is a small stage. ");
        super.doPerform();
    }
}
