package abstractfactory;

import junit.framework.TestCase;
import org.junit.Test;

public class AbstractFactoryTest extends TestCase {

    @Test
    public void test(){
        System.out.println("Test abstract factory:");
        FacilityFactory factory;
        System.out.println("Use PolarBear Style Facility:");
        factory=new PolarBearFacilityFactory();
        useFacility(factory);
        System.out.println("Use Penguin Style Facility:");
        factory=new PenguinFacilityFactory();
        useFacility(factory);
        System.out.println("Use Seal Style Facility:");
        factory=new SealFacilityFactory();
        useFacility(factory);
    }

    public void useFacility(FacilityFactory factory)
    {
        BumperCar bumperCar;
        RollerCoaster rollerCoaster;
        Restaurant restaurant;
        bumperCar=factory.createBumperCar();
        rollerCoaster=factory.createRollerCoaster();
        restaurant=factory.createRestaurant();
        bumperCar.play();
        rollerCoaster.play();
        restaurant.eat();
    }
}