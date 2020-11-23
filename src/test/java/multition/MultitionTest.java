package multition;

import junit.framework.TestCase;
import org.junit.Test;

public class MultitionTest extends TestCase {
    @Test
    public  void test() {
        for(int i = 0;i<5;i++){
            System.out.println(Chair.getInstance(i));
        }
        System.out.println(Chair.getInstance(190));
    }
}
