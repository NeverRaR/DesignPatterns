package readwritelock;

/**
 * @author 1754025徐菡志
 */

public class RepairManThread extends Thread{

    private final Film film;
    private int numberofrepairs;

    /**
     * The constructor of RepairManThread Class.
     * @param film: the object of film.
     */
    public RepairManThread(Film film){
        this.film = film;
        this.setName("repairman");
        System.out.println(this.getClass().getSimpleName()+
                ":("+
                this.hashCode()+
                "):RepairManThread():create the object of RepairManThread Class named "+
                this.getName()+
                " successfully.");
    }

    /**
     * run worker
     */
    public void run(){
        try {
            while (numberofrepairs<5){
                numberofrepairs++;
                film.write(film.getFilmname()+"(The screen has been repaired "+numberofrepairs+" times)");
                Thread.sleep(3000);
            }
        }catch (InterruptedException e){

        }
    }

}
