package abstractfactory;

/**
 * @author  NeverRaR
 */
public interface FacilityFactory {

    /**
     * 创建碰碰车
     * @return
     * 碰碰车
     */
    BumperCar createBumperCar();

    /**
     * 创建过山车
     * @return
     * 过山车
     */
    RollerCoaster createRollerCoaster();

    /**
     * 创建餐馆
     * @return
     * 餐馆
     */
    Restaurant createRestaurant();
}
