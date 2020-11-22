package multition;

import junit.framework.TestCase;

public class MultitionTest extends TestCase{
    public void test() {
        System.out.println("Multition Test:");
        for(int i = 0;i<5;i++){
            System.out.println("\t"+ChairMultition.getInstance(i).getInfo());
        }
        System.out.println("\t"+ChairMultition.getInstance(190));
        System.out.println("Exit Multition Test.");
    }
}
