package multition;

public class MultitionTest {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            System.out.println(Chair.getInstance(i));
        }
        System.out.println(Chair.getInstance(190));
    }
}
