package abstractfactory;

/**
 * @author  NeverRaR
 */
public class SealRestaurant implements Restaurant {
    public void eat() {
        System.out.println("SealRestaurant:("+hashCode()+"):eat:"+"You are eating in Seal Restaurant!");
    }
}
