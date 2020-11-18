package abstractfactory;

public interface FacilityFactory {
    BumperCar createBumperCar();
    RollerCoaster createRollerCoaster();
    Restaurant createRestaurant();
}
