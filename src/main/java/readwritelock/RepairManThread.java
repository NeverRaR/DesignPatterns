package readwritelock;

import java.util.Random;

public class RepairManThread extends Thread{
    //维修工人线程，写者
    private static final Random random = new Random();
    private final Film film;
    private final String filler;
    private int index = 0;
    public  RepairManThread(Film film, String filler){
        this.film = film;
        this.filler = filler;
    }

    public void run(){

        try {
            while (true){
                char c = nextchar();
                film.write(c);
                Thread.sleep(random.nextInt(3000));
            }
        }catch (InterruptedException e){

        }
    }

    private char nextchar(){
        char c = filler.charAt(index);
        index++;
        if(index>=filler.length()){
            index=0;
        }
        return c;
    }
}
