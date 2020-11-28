package callback;

/**
 * @Title: goToTheBathroom.java
 * 
 * @Package callback
 * 
 * @Description: Implementation of task that need to be executed.
 * 
 * @author Jiajie
 * 
 * @date 2020/11/28
 */
public class goToTheBathroom extends Task {

    /**
     *
     * @Description: Implementation of task that need to be executed.
     */
    @Override
    public void execute() {
        System.out.print("goToTheBathroom:getInstance:("+this.hashCode()+"): ");
        System.out.println("Go to the bathroom and then call back");
    }
}
