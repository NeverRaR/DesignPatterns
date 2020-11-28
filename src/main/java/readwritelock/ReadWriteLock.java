package readwritelock;

/**
 * @author 1754025徐菡志
 */

public final class ReadWriteLock {
    private int readingViewers=0;
    private int waitingRepairmen =0;
    private int writingRepairmen =0;
    private boolean preferWriter=true;

    /**
     * This method will be called when the read operation starts.
     */
    public synchronized void readlock() throws InterruptedException{
        while(writingRepairmen>0||(preferWriter&& waitingRepairmen >0)){
            wait();
        }
        readingViewers++;
    }

    /**
     * This method will be called at the end of the read operation.
     */
    public synchronized void readUnlock(){
        readingViewers--;
        preferWriter=true;
        notifyAll();
    }

    /**
     * This method will be called when the write operation starts.
     */
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

    /**
     * This method will be called at the end of the write operation.
     */
    public synchronized void writeUnlock(){
        writingRepairmen--;
        preferWriter=false;
        notifyAll();
    }
}
