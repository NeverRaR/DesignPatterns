package command;

/**
 * define Operator class, which enables operator to give command and let it be executed
 * @author 1853615邓斯语
 */
public class Operator {

    /**
     * execute the command through interface "Order"
     * @param order
     */
    public void takeCommand(Order order) {
        order.execute();
    }
}
