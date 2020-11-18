package threadpool;

public class HealthCareTask extends Task {

    private static final int TIME_PER_PERSON = 200;

    public HealthCareTask(Integer numPeople) {
        super(numPeople * TIME_PER_PERSON);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getClass().getSimpleName(), super.toString());
    }
}

