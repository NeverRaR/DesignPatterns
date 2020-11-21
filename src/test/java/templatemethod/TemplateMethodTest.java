package templatemethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import templatemethod.*;

/**
 * @author nemo
 */
public class TemplateMethodTest {

    @Test
    public void main() {
        System.out.println("Test template method:");
        System.out.println("Creating cabinOne with DiningCabin..");
        HalflingCabin cabinOne = new HalflingCabin(
            "cabinOne",
            new DiningCabin()
        );
        System.out.println("Letting Nemo enter..");
        cabinOne.visitedBy("Nemo");
        System.out.println("Creating cabinTwo with SaloonCabin..");
        HalflingCabin cabinTwo = new HalflingCabin(
            "cabinTwo",
            new SaloonCabin()
        );
        System.out.println("Letting Marshmallow enter..");
        cabinTwo.visitedBy("Marshmallow");
        System.out.println("Changing cabinOne's cabin type to HardSeatCabin..");
        cabinOne.changeCabin(new HardSeatCabin());
        System.out.println("Letting Nemo enter..");
        cabinOne.visitedBy("Nemo");
    }
}
