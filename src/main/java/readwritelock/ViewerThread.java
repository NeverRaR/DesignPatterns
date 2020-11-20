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
                String filmmessage = film.read();
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){

        }
    }
}
