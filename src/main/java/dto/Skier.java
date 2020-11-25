package dto;

/**
 * @author Nam
 *
 * @Description: Receive a packaged order from the pre-processing office and unpack it.
 */
public class Skier {
    public void receiveFoodPackage(SkitoolPackage preprocessed){
        System.out.println("(" + this.toString() + ") : " + "Got Package at time: " + preprocessed.getPreprocessedTime()
                .toString() + ", Ordered by: " + preprocessed.getOrderer() + ", including tools: \n" +
                preprocessed.toolsToString());
        System.out.println("(" + this.toString() + ") : " + "Start skiing!");
    }
}