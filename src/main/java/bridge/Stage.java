package bridge;

public class Stage {
    private Performance performance;
    protected Stage(Performance performance){
        this.performance = performance;
    }
    protected void doPerform(){
        performance.performActivity();
    }
    public void modifyActivity(Performance newPerformance){
        this.performance = newPerformance;
    }
}
