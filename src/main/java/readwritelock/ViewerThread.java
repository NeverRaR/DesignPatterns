package readwritelock;

public class ViewerThread extends Thread{
    //观众线程，读者
    private final Film film;
    private int readtimes;//观影次数

    public ViewerThread(Film film){
        this.film = film;
    }

    public void run(){
        try {
            while(readtimes<16){
                readtimes++;
                film.read();
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){

        }
    }
}
