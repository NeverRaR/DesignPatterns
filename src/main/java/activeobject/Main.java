package activeobject;

public class Main {
    public static void main(String[] args) {
            ActiveObject activeObject=ActiveObjectFactory.createActiveObject();
            new SolveEventThread("告示板",activeObject,100).start();
    }
}
