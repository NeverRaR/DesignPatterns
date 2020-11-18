package activeobject;

public class ActivationQueue {
    private static final int MAX_METHOD_REQUEST=100;
    private final MethodRequest[] requestQueue;
    private int tail;//下一个putRequest的地方
    private int head;//下一个takeRequest的地方
    private int count;//MethodRequest的数量

    public ActivationQueue(){
        this.requestQueue=new MethodRequest[MAX_METHOD_REQUEST];
        this.tail=0;
        this.head=0;
        this.count=0;
    }

    public synchronized void putRequest(MethodRequest request){
        while(count>=requestQueue.length){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        requestQueue[tail]=request;
        tail=(tail+1)%requestQueue.length;
        count++;
        notifyAll();
    }

    public synchronized MethodRequest takeRequest(){
        while (count<=0){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        MethodRequest request=requestQueue[head];
        head=(head+1)%requestQueue.length;
        count--;
        notifyAll();
        return request;
    }

}
