package flyweight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlyWeightTest {
    @Test
    public void test(){
        System.out.println("测试Flyweight模式：");
        System.out.println("");

        AbstractCoinFactory GoldCoinFactory = new GoldCoinFactory();
        BigCoin firstBigCoin = GoldCoinFactory.createBigCoin();
        int hashCode_1 = firstBigCoin.hashCode();
        System.out.println("Hash code of the first object of BigCoin is: " + hashCode_1);

        BigCoin secondBigCoin = GoldCoinFactory.createBigCoin();
        int hashCode_2 = secondBigCoin.hashCode();
        System.out.println("Hash code of the second object of Hoe is: " + hashCode_2);

        assertEquals(hashCode_1, hashCode_2);
        System.out.println("先后获取的两个实例对象的hashCode一样，说明共享同一份内存空间，测试成功！");
    }
}
