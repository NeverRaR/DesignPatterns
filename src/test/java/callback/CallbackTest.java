package callback;

import org.junit.Test;

/**
 * @Title: CallbackTest.java
 *
 * @Package callback
 *
 * @Description: Add a field as a counter of people go to bathroom.  Add Unit
 *  * test checks that the field is being incremented.
 *
 * @author Jiajie
 *
 * @date 2020/11/28
 */
public class CallbackTest {
    private Long callingCount = Long.valueOf(0);

    /**
     * @Description: Test the callback
     *
     */
    @Test
    public void test() {

        Callback callback = () -> callingCount++;

        goToTheBathroom task = new goToTheBathroom();

        System.out.println("Initial calling count of 0");
        System.out.println("CallbackTest:getInstance:("+this.hashCode()+"): calling count = " + callingCount.toString());

        System.out.println("\nCallback called once");
        task.executeWith(callback);
        System.out.println("CallbackTest:getInstance:("+this.hashCode()+"): calling count = " + callingCount.toString());

        System.out.println("\nCallback called twice");
        task.executeWith(callback);
        System.out.println("CallbackTest:getInstance:("+this.hashCode()+"): calling count = " + callingCount.toString());
    }
}
