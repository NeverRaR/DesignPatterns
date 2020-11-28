package activeobject;



import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author  NeverRaR
 */
public class Servant implements ActiveObject{
    /**
     *
     * @param message
     * message of complaint
     *
     * @return
     * solve result
     */
    @Override
    public Result solveEvent(String message) {
        System.out.println("Servant:("+hashCode()+"):solveEvent:"+ "begin to solve "+message+" at "+new Date());
        String solveResult = "";
        try {
            Thread.sleep(100);
            if (ThreadLocalRandom.current().nextDouble() < 0.3) solveResult = "refused";//refuse to solve
            else solveResult = "solved";
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        return new RealResult(new String(message+" is "+solveResult+"!"));
    }

    /**
     * "Servant" does not have thread, "kill" is null
     */
    @Override
    public void kill() {

    }

}
