package abstractfactory;

/**
 * @author  NeverRaR
 */
public class PolarBearRollerCoaster implements RollerCoaster{
    public void play() {
        System.out.println("PolarBearRollerCoaster:("+hashCode()+"):play:"+"You are playing PolarBear RollerCoaster!");
    }
}
