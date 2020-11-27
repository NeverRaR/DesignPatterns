package interpreter;

/**
 * Node to be interpreted and executed
 */
public abstract class Node {
    public abstract void interpret(Context context);

    public abstract void execute();
}
