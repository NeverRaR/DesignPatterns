package abstractfactory;

/**
 * @author  NeverRaR
 */
public class PenguinRollerCoaster implements RollerCoaster{
    public void play() {
        System.out.println("PenguinRollerCoaster:("+hashCode()+"):play:"+"You are playing Penguin RollerCoaster!");
    }
}
