package abstractfactory;

/**
 * @author  NeverRaR
 */
public class PolarBearRestaurant implements Restaurant{
    public void eat() {
        System.out.println("PolarBearRestaurant:("+hashCode()+"):eat:"+"You are eating in PolarBear Restaurant!");
    }
}
