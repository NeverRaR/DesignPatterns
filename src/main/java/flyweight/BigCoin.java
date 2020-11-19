package flyweight;

public class BigCoin implements Coin {
    @Override
    public void pay() {
        System.out.println("You Spent a BIG COIN!!!");
    }
}
