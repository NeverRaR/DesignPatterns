package lazyload;

//演员需求
public class ActorHolder {
    private Actor actor;

    public ActorHolder() {
        System.out.println("(" + this.toString() + "): " + "Actor Holder has been created.");
    }

    //请求一个演员时，才创建演员对象
    public Actor getActor() {
        if (actor == null) {
            actor = new Actor();
        }
        return actor;
    }
}
