package threadpool;

/**
 * @author nemo
 */
public class HealthCareTask extends Task {

    private static final int TIME_PER_PERSON = 200;

    /**
     * @param numPeople task related parameter
     */
    public HealthCareTask(Integer numPeople) {
        super(numPeople * TIME_PER_PERSON);
    }

    /**
     * @return String: task's description
     */
    @Override
    public String toString() {
        return String.format(
            "%s %s",
            this.getClass().getSimpleName(),
            super.toString()
        );
    }
}
