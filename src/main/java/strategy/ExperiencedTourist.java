package strategy;

public class ExperiencedTourist {

    private MovingMethod method;

    public ExperiencedTourist(MovingMethod method) {
        this.method = method;
    }

    public void changeMethod(MovingMethod method) {
        this.method = method;
    }

    public void goToDestination() {
        System.out.println(method.execute());
    }
}
