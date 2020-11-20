package Facade;

import facade.CheckPoint;
import org.junit.Test;

public class FacadeTest {
    @Test
    public void test() {
        CheckPoint checkCollector = new CheckPoint();
        checkCollector.toCheck();
    }
}