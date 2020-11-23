package readwritelock;

import junit.framework.TestCase;
import org.junit.Test;

public class ReadWriteLockTest extends TestCase {
    public static void test(String args[]) {
        System.out.println("正在使用读写锁模式:");

        Film film = new Film(10);
        ViewerThread viewer1= new ViewerThread(film);
        ViewerThread viewer2=new ViewerThread(film);
        ViewerThread viewer3= new ViewerThread(film);
        RepairManThread  repairMan= new RepairManThread(film, "坏好坏好坏好坏好坏好");
        viewer1.start();
        viewer2.start();
        viewer3.start();
        repairMan.start();
        try {
            viewer1.join();
            viewer2.join();
            viewer3.join();
            repairMan.join();
        }
        catch ( InterruptedException e){
            e.printStackTrace();
        }
    }

}
