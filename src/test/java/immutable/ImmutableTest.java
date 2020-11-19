package immutable;

import org.junit.Test;

public class ImmutableTest {
    @Test
    public void main() {
        System.out.println("Test Immutable: ");
        Building building = new Building("Ice Restaurant", "E2-12");
        BuildingInfo info = new BuildingInfo(building, 25);
        System.out.println(info);
        /*
         * 尝试进行修改
         */
        building.setLocation("W12-2");
        building.setName("Service Center");
        System.out.println(info);
    }
}
