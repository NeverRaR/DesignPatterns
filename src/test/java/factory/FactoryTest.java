package factory;

import junit.framework.TestCase;
import org.junit.Test;

public class FactoryTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Test factory:");
        BuildFacility buildFacility = new BuildFacility();
        //新建设施
        Facility iceRink = buildFacility.build("ice rink");
        if(iceRink != null) {
            iceRink.build();
        }
        Facility skiField = buildFacility.build("ski field");
        if(skiField != null) {
            skiField.build();
        }
        Facility cableCar = buildFacility.build("cable car");
        if(cableCar != null) {
            cableCar.build();
        }
        Facility juan = buildFacility.build("juan");
        if(juan != null) {
            juan.build();
        }
    }
}
