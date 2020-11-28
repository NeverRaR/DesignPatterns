package abstractfactory;

/**
 * @author  NeverRaR
 */
public class SealBumperCar implements BumperCar {
    public void play() {
        System.out.println("SealBumperCar:("+hashCode()+"):play:"+"You are playing Seal BumperCar!");
    }
}
