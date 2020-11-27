package Facade;

import facade.CheckPoint;
import junit.framework.TestCase;
import org.junit.Test;

public class FacadeTest extends TestCase {
    @Test
    public void test() {
        CheckPoint checkCollector = new CheckPoint();
        checkCollector.toCheck();
    }
}