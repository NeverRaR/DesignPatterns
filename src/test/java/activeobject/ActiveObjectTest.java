package activeobject;

public class ActiveObjectTest {
    public static void main(String[] args) {
        new SolveEventThread("顾客",ActiveObjectFactory.createActiveObject(),200).start();
    }
}
