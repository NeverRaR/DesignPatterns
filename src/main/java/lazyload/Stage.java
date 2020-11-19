package lazyload;

public class Stage {
    private ActorHolder actorHolder;

    public Stage() {
        System.out.println("(" + this.toString() + "): " + "Stage is ready. ");
        this.actorHolder = new ActorHolder();
    }

    public Actor getActor() {
        return actorHolder.getActor();
    }
}