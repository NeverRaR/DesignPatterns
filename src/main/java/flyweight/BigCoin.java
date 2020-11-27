package flyweight;

/**
 * Big coin implements Coin interface
 */
public class BigCoin implements Coin {
    @Override
    public void pay() {
        System.out.println("You Spent a BIG COIN!!!");
    }
}
