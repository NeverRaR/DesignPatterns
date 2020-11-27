package LazyLoading;

import junit.framework.TestCase;
import lazyload.lazyLoading;
import org.junit.Test;

public class LazyLoadingTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Test Feature Toggle: ");
        lazyLoading.handleActor();
    }
}
