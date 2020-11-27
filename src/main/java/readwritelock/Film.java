package readwritelock;

/**
 * @author 1754025徐菡志
 */

public class Film {
    private String film_info;
    private final String film_name;
    private int repair_times;
    private final ReadWriteLock lock = new ReadWriteLock();

    /**
     * The constructor of Film Class.
     * @param name: the name of film.
     */
    public Film(String name){
        this.film_info = name + "(The screen has been repaired 0 times)";
        this.film_name = name;
        System.out.println(this.getClass().getSimpleName()+
                ":("+
                this.hashCode()+
                "):Film():create the object of Film named" + this.film_name + "successfully.");
    }

    /**
     * Read current movie information.
     */
    public void read()throws InterruptedException{
        lock.readlock();
        try {
            System.out.println(this.getClass().getSimpleName()+":("+
                    this.hashCode()+
                    "):read(): "+
                    "(Thread:"+ Thread.currentThread().getName()+") "
                    +Thread.currentThread().getName() + " is watching movie" +
                    this.film_info);
        }
        finally {
            lock.readUnlock();
        }
    }

    /**
     * Modify the information of the movie.
     * @param movie_info: the information of the movie to be modified.
     */
    public void write(String movie_info) throws InterruptedException{
        lock.writeLock();
        try{
            repair_times++;
            System.out.println(this.getClass().getSimpleName()+":("+
                    this.hashCode()+
                    "):write(): "+
                    "(Thread:"+ Thread.currentThread().getName()+")"+
                    " The repairman is repairing the screen for the "+ repair_times +" times,and cannot watch the movie, please wait!"
            );
            Thread.sleep(5000);
            this.film_info = movie_info;
        }finally {
            lock.writeUnlock();
        }
    }

    /**
     * Get the name of film.
     * @return film_name: the name of film.
     */
    public String getFilmname() {
        return film_name;
    }

}
