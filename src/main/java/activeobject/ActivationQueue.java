package activeobject;

/**
 * @author  NeverRaR
 */
public class ActivationQueue {
    private static final int MAX_METHOD_REQUEST=100;
    private final MethodRequest[] requests;
    private int tail;//下一个putRequest的地方
    private int head;//下一个takeRequest的地方
    private int count;//MethodRequest的数量

    public ActivationQueue(){
        this.requests =new MethodRequest[MAX_METHOD_REQUEST];
        this.tail=0;
        this.head=0;
        this.count=0;
    }

    /**
     *
     * @return
     * 队列是否为空
     */
    public synchronized boolean isEmpty(){
        return this.count==0;
    }

    /**
     *向队列中放入新请求，如果超出上限则阻塞线程
     *
     * @param request
     * 新请求
     */
    public synchronized void putRequest(MethodRequest request){
        while(count>= requests.length){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        requests[tail]=request;
        tail=(tail+1)% requests.length;
        count++;
        notifyAll();
    }

    /**
     * 从队列中取出请求，如果队列为空则阻塞线程
     * @return
     * 返回请求
     */
    public synchronized MethodRequest takeRequest(){
        while (count<=0){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        MethodRequest request= requests[head];
        head=(head+1)% requests.length;
        count--;
        notifyAll();
        return request;
    }

}
