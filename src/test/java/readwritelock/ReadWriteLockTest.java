package readwritelock;

import junit.framework.TestCase;
import org.junit.Test;

public class ReadWriteLockTest extends TestCase{

    @Test
    public void test() {
        System.out.println("ReadWriteLockTest:");

        System.out.println("Creating Film object...");
        Film film = new Film("《Frozen》");
        System.out.println();

        System.out.println("Creating audienceThread object...");
        AudienceThread audience1= new AudienceThread(film,"audience1");
        AudienceThread audience2= new AudienceThread(film,"audience2");
        AudienceThread audience3= new AudienceThread(film,"audience3");
        System.out.println();

        System.out.println("Creating repairmanThread object...");
        RepairManThread repairMan= new RepairManThread(film);
        System.out.println();

        audience1.start();
        audience2.start();
        audience3.start();
        repairMan.start();
        try {
            audience1.join();
            audience2.join();
            audience3.join();
            repairMan.join();
        }
        catch ( InterruptedException e){
            e.printStackTrace();
        }
    }

}
