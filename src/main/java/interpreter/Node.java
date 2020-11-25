package interpreter;

/**
 * Node to be interpreted and executed
 */
public abstract class Node {
    public abstract void Interpret(Context context);

    public abstract void Execute();
}
