package lazyload;

public class lazyLoading {
    public static void handleActor() {
        Stage stage = new Stage();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stage Handler: Need an actor !");
        Actor actor = stage.getActor();
    }
}
