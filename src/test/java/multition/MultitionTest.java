package multition;


import org.junit.Test;

public class MultitionTest {
    @Test
    public  void main() {
        System.out.println("Multition Test:");

        for(int i = 0;i<5;i++){
            System.out.println("\t"+ChairMultition.getInstance(i).getInfo());
        }
        System.out.println("\t"+ChairMultition.getInstance(190));
        System.out.println("Exit Multition Test.");
    }
}
