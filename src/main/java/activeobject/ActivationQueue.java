package activeobject;

/**
 * @author  NeverRaR
 */
public class ActivationQueue {
    private static final int MAX_METHOD_REQUEST=100;
    private final MethodRequest[] requests;
    private int tail;//position of next putRequest
    private int head;//position of next takeRequest
    private int count;//count of MethodRequest

    public ActivationQueue(){
        this.requests =new MethodRequest[MAX_METHOD_REQUEST];
        this.tail=0;
        this.head=0;
        this.count=0;
    }

    /**
     *
     * @return
     * whether the queue is empty or not
     */
    public synchronized boolean isEmpty(){
        return this.count==0;
    }

    /**
     * put a new request into the queue, and block the thread if the upper limit is exceeded
     *
     * @param request
     * new request
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
     * take a request from the queue, and block the thread if the queue is empty
     * @return
     * request
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
