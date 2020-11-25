package flyweight;

/**
 * Abstract Coin factory to create coins
 * Providing big coins and small coins now
 */
public abstract class AbstractCoinFactory {
    public abstract BigCoin createBigCoin();

    public abstract SmallCoin createSmallCoin();
}
