package activeobject;



import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Servant implements ActiveObject{
    @Override
    public Result solveEvent(String message) {
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

    @Override
    public void kill() {

    }

}
