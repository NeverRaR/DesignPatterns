package activeobject;

/**
 * @author  NeverRaR
 */
public class FutureResult extends Result {
    private Result result;
    private boolean ready=false;

    /**
     *设置实际上的处理结果，设置ready标记并唤醒所有因等待结果而被阻塞的线程
     * @param result
     * 实际结果
     */
    public synchronized void setResult(Result result){
         this.result=result;
         this.ready=true;
         notifyAll();
    }

    /**
     * 获取实际上的结果，如果结果未准备完毕，则阻塞线程
     * @return
     * 实际结果
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
