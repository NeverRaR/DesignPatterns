package readwritelock;

import java.util.Random;

public class RepairManThread extends Thread{
    //维修工人线程，写者
    private final Film film;
    private int repairtimes;//维修次数

    public RepairManThread(Film film){
        this.film = film;
    }

    public void run(){
        try {
            while (true){
                repairtimes++;
                film.write(film.getFilmname()+"(幕布维修"+repairtimes+"次)");
                Thread.sleep(3000);
            }
        }catch (InterruptedException e){

        }
    }

}
