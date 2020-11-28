package abstractfactory;

/**
 * @author  NeverRaR
 */
public interface FacilityFactory {

    /**
     * create bumper car
     * @return
     * bumper car
     */
    BumperCar createBumperCar();

    /**
     * create roller coaster
     * @return
     * roller coaster
     */
    RollerCoaster createRollerCoaster();

    /**
     * create restaurant
     * @return
     * restaurant
     */
    Restaurant createRestaurant();
}
