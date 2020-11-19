package threadpool;

public class NavigationTask extends Task {

    private static final int TIME_PER_PERSON = 300;

    public NavigationTask(Integer numPeople) {
        super(numPeople * TIME_PER_PERSON);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getClass().getSimpleName(), super.toString());
    }
}
