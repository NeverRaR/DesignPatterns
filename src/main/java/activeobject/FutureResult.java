package activeobject;

/**
 * @author  NeverRaR
 */
public class FutureResult extends Result {
    private Result result;
    private boolean ready=false;

    /**
     * set the real result, and set "ready" flag and wake up all threads that are blocked due to waiting for the result
     * @param result
     * real result
     */
    public synchronized void setResult(Result result){
         this.result=result;
         this.ready=true;
         notifyAll();
    }

    /**
     * get the real result, and block the thread if the result is not produced
     * @return
     * real result
     */
    public synchronized Object getResultValue(){
        while(!ready){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        return result.getResultValue();
    }
}
