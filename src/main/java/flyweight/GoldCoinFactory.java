package flyweight;

/**
 * Flyweight pattern is implemented in this GoldCoinFactory
 */
public class GoldCoinFactory extends AbstractCoinFactory{

    private BigCoin bigCoin;
    private SmallCoin smallCoin;

    /**
     * Constructor, initializing bigCoin and smallCoin to null
     */
    public GoldCoinFactory(){
        System.out.println("======== 使用抽象工厂 Abstract Factory 模式 ========");
        this.bigCoin = null;
        this.smallCoin = null;
        System.out.println("成功创建金色硬币工厂");
    }

    /**
     * using flyweight pattern, if the coin is already created, just return without creating new object
     * @return bigCoin
     */
    @Override
    public BigCoin createBigCoin() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if(this.bigCoin == null){
            this.bigCoin = new BigCoin();
        }
        return this.bigCoin;
    }

    /**
     * using flyweight pattern, if the coin is already created, just return without creating new object
     * @return smallCoin
     */
    @Override
    public SmallCoin createSmallCoin() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if(this.smallCoin == null){
            this.smallCoin = new SmallCoin();
        }
        return this.smallCoin;
    }
}
