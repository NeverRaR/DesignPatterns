package abstractfactory;

public class SealFacilityFactory implements FacilityFactory {
    public BumperCar createBumperCar() {
        return new SealBumperCar();
    }

    public RollerCoaster createRollerCoaster() {
        return new SealRollerCoaster();
    }

    public Restaurant createRestaurant() {
        return new SealRestaurant();
    }
}
