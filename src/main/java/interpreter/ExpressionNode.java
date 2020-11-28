package interpreter;

import java.util.ArrayList;
import java.util.List;

public class ExpressionNode extends Node {
    private List<Node> nodes = new ArrayList<Node>();

    /**
     * Read context and interpreter tokens one by one
     * @param context given context
     */
    @Override
    public void interpret(Context context) {
        while(context.getCurToken() != "END"){
            Node n = new DrinkNode();
            n.interpret(context);
            nodes.add(n);
        }

    }

    /**
     * Traverse the nodes and execute the total price
     */
    @Override
    public void execute() {
        for(Node n:nodes){
            n.execute();
        }
    }
}
