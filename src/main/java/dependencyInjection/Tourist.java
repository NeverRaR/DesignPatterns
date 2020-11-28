package dependencyInjection;

/**
 * @author Nam
 */
public class Tourist {
    public void tourist(Amusement amusement) {
        System.out.println("(" + this.toString() + "):" +"tourist: The tourist plays " + amusement.getName() + ".");
    }
}
