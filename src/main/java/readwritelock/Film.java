package readwritelock;

public class Film {
    private String filmmessage;
    private String filmname;
    private final ReadWriteLock lock = new ReadWriteLock();

    public Film(String name){
       this.filmmessage = name;
       this.filmname = name;
    }

    public String read()throws InterruptedException{
        lock.readlock();
        try {
            System.out.println(Thread.currentThread().getName()+"观看电影"+ filmmessage);
            return filmmessage;
        }
        finally {
            lock.readUnlock();
        }
    }

    public void write(String s) throws InterruptedException{
        lock.writeLock();
        try{
            System.out.println("维修工人正在维修幕布，不可观看电影，请等待！");
            slowlyWrite();
            this.filmmessage = s;
        }finally {
            lock.writeUnlock();
        }
    }

    public String getFilmname() {
        return filmname;
    }

    private void slowlyWrite(){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e ){

        }
    }

}
