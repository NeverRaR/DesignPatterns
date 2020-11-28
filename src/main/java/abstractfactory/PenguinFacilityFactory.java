package abstractfactory;

/**
 * @author  NeverRaR
 */
public class PenguinFacilityFactory implements FacilityFactory {
    public BumperCar createBumperCar() {
        System.out.println("PenguinFacilityFactory:("+hashCode()+"):createBumperCar:create a BumperCar");
        return new PenguinBumperCar();
    }

    public RollerCoaster createRollerCoaster() {
        System.out.println("PenguinFacilityFactory:("+hashCode()+"):createBumperCar:create a RollerCoaster");
        return new PenguinRollerCoaster();
    }

    public Restaurant createRestaurant() {
        System.out.println("PenguinFacilityFactory:("+hashCode()+"):createRestaurant:create a Restaurant");
        return new PenguinRestaurant();
    }
}
