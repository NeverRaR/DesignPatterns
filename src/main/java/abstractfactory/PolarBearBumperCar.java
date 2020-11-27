package abstractfactory;

/**
 * @author  NeverRaR
 */
public class PolarBearBumperCar implements BumperCar {

    public void play() {
        System.out.println("PolarBearBumperCar:("+hashCode()+"):play:"+"You are playing PolarBear BumperCar!");
    }
}
