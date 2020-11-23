package readwritelock;

/**
 * @author 1754025徐菡志
 */

public class AudienceThread extends Thread{

    private final Film film;
    private int numberofwatch;

    /**
     * The constructor of AudienceThread Class.
     * @param film: the object of film.
     * @param threadname: the name of thread.
     */
    public AudienceThread(Film film,String threadname){
        this.film = film;
        this.setName(threadname);
        System.out.println(this.getClass().getSimpleName()+
                ":("+
                this.hashCode()+
                "):AudienceThread():create the object of AudienceThread Class named "+
                this.getName()+
                " successfully.");
    }

    /**
     * run worker
     */
    public void run(){
        try {
            while(numberofwatch<16){
                numberofwatch++;
                film.read();
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){

        }
    }
}
