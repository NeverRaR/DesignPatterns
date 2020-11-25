package abstractfactory;

/**
 * @author  NeverRaR
 */
public class SealRollerCoaster implements RollerCoaster{
    public void play() {
        System.out.println("SealRollerCoaster:("+hashCode()+"):play:"+"You are playing Seal RollerCoaster!");
    }
}
