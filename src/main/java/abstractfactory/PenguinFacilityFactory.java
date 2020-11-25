package abstractfactory;

public class PenguinFacilityFactory implements FacilityFactory {
    public BumperCar createBumperCar() {
        System.out.println("PenguinFacilityFactory:"+toString()+":createBumperCar:create a BumperCar");
        return new PenguinBumperCar();
    }

    public RollerCoaster createRollerCoaster() {
        System.out.println("PenguinFacilityFactory:"+toString()+":createBumperCar:create a RollerCoaster");
        return new PenguinRollerCoaster();
    }

    public Restaurant createRestaurant() {
        System.out.println("PenguinFacilityFactory:"+toString()+":createRestaurant:create a Restaurant");
        return new PenguinRestaurant();
    }
}
