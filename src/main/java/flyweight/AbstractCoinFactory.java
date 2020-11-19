package flyweight;

public abstract class AbstractCoinFactory {
    public abstract BigCoin createBigCoin();

    public abstract SmallCoin createSmallCoin();
}
