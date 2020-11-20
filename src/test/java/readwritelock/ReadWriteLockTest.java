package readwritelock;

import org.junit.Test;

public class ReadWriteLockTest {
    public static void main(String args[]) {
        System.out.println("正在使用读写锁模式:");

        Film film = new Film("《冰雪奇缘》");
        ViewerThread viewer1= new ViewerThread(film);
        ViewerThread viewer2= new ViewerThread(film);
        ViewerThread viewer3= new ViewerThread(film);
        viewer1.setName("观众1");
        viewer2.setName("观众2");
        viewer3.setName("观众3");
        RepairManThread repairMan= new RepairManThread(film);
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
