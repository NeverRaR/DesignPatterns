package abstractfactory;

/**
 * @author  NeverRaR
 */
public class SealFacilityFactory implements FacilityFactory {
    public BumperCar createBumperCar() {
        System.out.println("SealFacilityFactory:("+hashCode()+"):createBumperCar:create a BumperCar");
        return new SealBumperCar();
    }

    public RollerCoaster createRollerCoaster() {
        System.out.println("SealFacilityFactory:("+hashCode()+"):createBumperCar:create a RollerCoaster");
        return new SealRollerCoaster();
    }

    public Restaurant createRestaurant() {
        System.out.println("SealFacilityFactory:("+hashCode()+"):createRestaurant:create a Restaurant");
        return new SealRestaurant();
    }
}
