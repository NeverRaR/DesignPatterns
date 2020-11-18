package nullobject;

import org.junit.Test;

public class NullObjectTest {
    @Test
    public  void main() {
        Stub stub = new Stub("0002","0002");
        Stub stub1 = new Stub("0004","0004");
        TicketFinder finder = new TicketFinder();
        Ticket t = finder.Find(stub);
        System.out.println(t.getID());
        Ticket t1 = finder.Find(stub1);
        System.out.println(t1.getID());
    }
}
