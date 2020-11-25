package abstractfactory;

/**
 * @author  NeverRaR
 */
public class PolarBearFacilityFactory implements FacilityFactory{
    public BumperCar createBumperCar() {
        System.out.println("PolarBearFacilityFactory:("+hashCode()+"):createBumperCar:create a BumperCar");
        return new PolarBearBumperCar();
    }

    public RollerCoaster createRollerCoaster() {
        System.out.println("PolarBearFacilityFactory:("+hashCode()+"):createBumperCar:create a RollerCoaster");
        return new PolarBearRollerCoaster();
    }

    public Restaurant createRestaurant() {
        System.out.println("PolarBearFacilityFactory:("+hashCode()+"):createRestaurant:create a Restaurant");
        return new PolarBearRestaurant();
    }
}
