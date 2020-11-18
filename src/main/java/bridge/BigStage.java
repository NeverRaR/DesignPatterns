package bridge;

public class BigStage extends Stage{
    protected BigStage(Performance performance) {
        super(performance);
    }

    @Override
    protected void doPerform() {
        System.out.print("This is a big stage. ");
        super.doPerform();
    }
}
