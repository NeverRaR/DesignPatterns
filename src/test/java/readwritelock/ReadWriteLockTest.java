package readwritelock;

public class ReadWriteLockTest {
    public void main() {
        System.out.println("正在使用读写锁模式:");

        Film film = new Film(10);
        new ViewerThread(film).start();
        new ViewerThread(film).start();
        new ViewerThread(film).start();

        new RepairManThread(film, "坏好坏好坏好坏好坏好").start();
    }

}
