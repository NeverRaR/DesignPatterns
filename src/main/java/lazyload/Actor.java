package lazyload;

public class Actor {
    public Actor() {
        System.out.println("(" + this.toString() + "): " + "Actor begin to prepare ! ");
        try {
            System.out.println("(" + this.toString() + "): " + " Actor is in preparation ......");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("(" + this.toString() + "): " + "Actor is ready !");
    }
}
