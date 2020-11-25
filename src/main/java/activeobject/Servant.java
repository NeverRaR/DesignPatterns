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
     * 投诉信息
     *
     * @return
     * 解决结果
     */
    @Override
    public Result solveEvent(String message) {
        System.out.println("Servant:("+hashCode()+"):solveEvent:"+ "begin to solve "+message+" at "+new Date());
        String solveResult = "";
        try {
            Thread.sleep(100);
            if (ThreadLocalRandom.current().nextDouble() < 0.3) solveResult = "refused";//拒绝处理该投诉
            else solveResult = "solved";
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        return new RealResult(new String(message+" is "+solveResult+"!"));
    }

    /**
     * Servant不持有线程，kill为空
     */
    @Override
    public void kill() {

    }

}
