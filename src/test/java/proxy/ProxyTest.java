package proxy;

import junit.framework.TestCase;
import org.junit.Test;

public class ProxyTest extends TestCase {
    @Test
    public void test(){

        System.out.println("ProxyTest:");

        System.out.println("Creating the object to be proxied...");
        GeneralManager generalManager = new GeneralManager();
        System.out.println();

        System.out.println("Creating the proxy object...");
        FinanceManagerProxy financeManagerProxy = new FinanceManagerProxy(generalManager);
        System.out.println();

        financeManagerProxy.manageFinance();

    }
}
