package interpreter;

public abstract class Node {
    public abstract void Interpret(Context context);

    public abstract void Execute();
}
