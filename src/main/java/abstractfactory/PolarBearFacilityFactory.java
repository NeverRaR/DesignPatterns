package abstractfactory;

public class PolarBearFacilityFactory implements FacilityFactory{
    public BumperCar createBumperCar() {
        return new PolarBearBumperCar();
    }

    public RollerCoaster createRollerCoaster() {
        return new PolarBearRollerCoaster();
    }

    public Restaurant createRestaurant() {
        return new PolarBearRestaurant();
    }
}
