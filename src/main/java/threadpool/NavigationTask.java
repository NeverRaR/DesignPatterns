package threadpool;

/**
 * @author nemo
 */
public class NavigationTask extends Task {

    private static final int TIME_PER_PERSON = 300;

    /**
     * @param numPeople task related parameter
     */
    public NavigationTask(Integer numPeople) {
        super(numPeople * TIME_PER_PERSON);
    }

    /**
     * @return String: task's description
     */
    @Override
    public String toString() {
        return String.format("%s %s", this.getClass().getSimpleName(), super.toString());
    }
}
