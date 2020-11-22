package nullobject;

import org.junit.Test;

/**
 * Unit Test for Null Object pattern
 * @author 1851594王思桐
 */
public class NullObjectTest {
    @Test
    public  void main() {
        System.out.println("NullObjectTest:");

        System.out.println("\tCreate two stubs 0002 and 0004\n");
        System.out.println("\t0002 is in the Ticket Database");
        System.out.println("\t0004 is not in the Ticket Database\n");

        Stub stub = new Stub("0002","0002");
        Stub stub1 = new Stub("0004","0004");

        TicketFinder finder = new TicketFinder();

        System.out.println("\tWe can find 0002:");
        Ticket t = finder.Find(stub);

        System.out.println("\t"+t.getInfo());

        System.out.println("\tBut 0004 is an invalid Ticket:");
        Ticket t1 = finder.Find(stub1);
        System.out.println("\t"+t1.getInfo());

        System.out.println("\nExit NullObjectTest");
    }
}
