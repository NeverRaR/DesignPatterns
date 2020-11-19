package readwritelock;

public class ViewerThread extends Thread{
    //观众线程，读者
    private final Film film;

    public ViewerThread(Film film){
        this.film = film;
    }
    public void run(){
        try {
            while(true){
                char[] readbuf = film.read();
                System.out.println(Thread.currentThread().getName()+" reads "+String.valueOf(readbuf));
            }
        }catch (InterruptedException e){

        }
    }
}
