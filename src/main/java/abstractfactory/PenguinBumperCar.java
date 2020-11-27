package abstractfactory;

/**
 * @author  NeverRaR
 */
public class PenguinBumperCar implements BumperCar{
    public void play() {
        System.out.println("PenguinBumperCar:("+hashCode()+"):play:"+"You are playing Penguin BumperCar!");
    }
}
