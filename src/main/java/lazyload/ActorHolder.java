package lazyload;

//actor demand
public class ActorHolder {
    private Actor actor;

    public ActorHolder() {
        System.out.println("(" + this.toString() + "): " + "Actor Holder has been created.");
    }

    //create an actor when requested
    public Actor getActor() {
        if (actor == null) {
            actor = new Actor();
        }
        return actor;
    }
}
