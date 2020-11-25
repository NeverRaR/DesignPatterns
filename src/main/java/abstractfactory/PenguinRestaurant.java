package abstractfactory;

/**
 * @author  NeverRaR
 */
public class PenguinRestaurant implements Restaurant{
    public void eat() {
        System.out.println("PenguinRestaurant:("+hashCode()+"):eat:"+"You are eating in Penguin Restaurant!");
    }
}
