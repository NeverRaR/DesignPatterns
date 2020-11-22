package flyweight;

public class GoldCoinFactory extends AbstractCoinFactory{

    private BigCoin bigCoin;
    private SmallCoin smallCoin;

    public GoldCoinFactory(){
        System.out.println("======== 使用抽象工厂 Abstract Factory 模式 ========");
        this.bigCoin = null;
        this.smallCoin = null;
        System.out.println("成功创建金色硬币工厂");
    }

    @Override
    public BigCoin createBigCoin() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if(this.bigCoin == null){
            this.bigCoin = new BigCoin();
        }
        return this.bigCoin;
    }

    @Override
    public SmallCoin createSmallCoin() {
        System.out.println("======== 使用享元 Flyweight 模式 ========");
        if(this.smallCoin == null){
            this.smallCoin = new SmallCoin();
        }
        return this.smallCoin;
    }
}
