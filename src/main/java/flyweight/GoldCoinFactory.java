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

        this.bigCoin = null;
        this.smallCoin = null;
        System.out.println("(" + this.toString() + ") : " + "Create GoldCoinFactory successfully!");
    }

    /**
     * using flyweight pattern, if the coin is already created, just return without creating new object
     * @return bigCoin
     */
    @Override
    public BigCoin createBigCoin() {
        if(this.bigCoin == null){
            this.bigCoin = new BigCoin();
        }
        System.out.println("(" + this.toString() + ") : " + "Create BigCoin successfully!");
        return this.bigCoin;
    }

    /**
     * using flyweight pattern, if the coin is already created, just return without creating new object
     * @return smallCoin
     */
    @Override
    public SmallCoin createSmallCoin() {
        if(this.smallCoin == null){
            this.smallCoin = new SmallCoin();
        }
        System.out.println("(" + this.toString() + ") : " + "Create SmallCoin successfully!");
        return this.smallCoin;
    }
}
