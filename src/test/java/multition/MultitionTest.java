package multition;

import org.junit.Test;

public class MultitionTest {
    @Test
    public  void main() {
        for(int i = 0;i<5;i++){
            System.out.println(Chair.getInstance(i));
        }
        System.out.println(Chair.getInstance(190));
    }
}
