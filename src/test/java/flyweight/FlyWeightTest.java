package flyweight;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlyWeightTest extends TestCase {
    @Test
    public void test(){
        System.out.println("(" + this.toString() + ") : " + "Testing Flyweight pattern：");

        AbstractCoinFactory GoldCoinFactory = new GoldCoinFactory();
        BigCoin firstBigCoin = GoldCoinFactory.createBigCoin();
        int hashCode_1 = firstBigCoin.hashCode();
        System.out.println("(" + this.toString() + ") : " + "Hash code of the first object of BigCoin is: " + hashCode_1);

        BigCoin secondBigCoin = GoldCoinFactory.createBigCoin();
        int hashCode_2 = secondBigCoin.hashCode();
        System.out.println("(" + this.toString() + ") : " + "Hash code of the second object of BigCoin is: " + hashCode_2);

        assertEquals(hashCode_1, hashCode_2);
        System.out.println("(" + this.toString() + ") : " + "The hashCode of the two instance objects obtained successively is the same" +
                " indicating that they share the same memory space");
    }
}
