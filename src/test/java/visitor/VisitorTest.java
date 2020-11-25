package visitor;

import junit.framework.TestCase;
import org.junit.Test;

import visitor.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import org.junit.Test;
import visitor.*;



/**
 * @author nemo
 */
public class VisitorTest  extends TestCase {

    @Test
    public void test() {
        System.out.println("Test visitor:");
        System.out.println("Initializing a tree structure...");
        Manager manager = new Manager(
            "Su",
            new ViceManager(
                "cxf",
                new Staff("Nemo"),
                new Staff("Zen"),
                new Staff("Bulldozer")
            ),
            new ViceManager(
                "xzc",
                new Staff("Pussy"),
                new Staff("Apollo"),
                new Staff("Ice")
            )
        );
        System.out.println("======Find all staffs======");
        manager.accept(new StaffVisitor());
        System.out.println("============");
        System.out.print("\n\n\n");
        System.out.println("======Find all vice managers======");
        manager.accept(new ViceManagerVisitor());
        System.out.println("============");
        System.out.print("\n\n\n");
        System.out.println("======Find all manager(s)======");
        manager.accept(new ManagerVisitor());
        System.out.println("============");
        System.out.print("\n\n\n");
    }
}
