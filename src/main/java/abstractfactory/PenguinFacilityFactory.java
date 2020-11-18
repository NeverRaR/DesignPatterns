package abstractfactory;

public class PenguinFacilityFactory implements FacilityFactory {
    public BumperCar createBumperCar() {
        return new PenguinBumperCar();
    }

    public RollerCoaster createRollerCoaster() {
        return new PenguinRollerCoaster();
    }

    public Restaurant createRestaurant() {
        return new PenguinRestaurant();
    }
}
