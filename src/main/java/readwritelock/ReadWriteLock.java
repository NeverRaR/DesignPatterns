package readwritelock;

public final class ReadWriteLock {
    private int readingViewers=0;//实际正在观影的观众数量
    private int waitingRepairmen =0;//正在等待维修的工人
    private int writingRepairmen =0;//实际正在维修的工人
    private boolean preferWriter=true;//代表写入优先

    public synchronized void readlock() throws InterruptedException{
        while(writingRepairmen>0||(preferWriter&& waitingRepairmen >0)){
            wait();
        }
        readingViewers++;
    }

    public synchronized void readUnlock(){
        readingViewers--;
        preferWriter=true;
        notifyAll();
    }

    public synchronized void writeLock()throws InterruptedException{
        waitingRepairmen++;
        try {
            while(readingViewers>0||writingRepairmen>0){
                wait();
            }
        }finally {
            waitingRepairmen--;
        }
        writingRepairmen++;
    }

    public synchronized void writeUnlock(){
        writingRepairmen--;
        preferWriter=false;
        notifyAll();
    }
}
