package proxy;

import org.junit.Test;

public class ProxyTest {
    @Test
    public static void main(String[] args){

        System.out.println("正在使用代理模式:");
        //创建被代理对象
        GeneralManager generalManager = new GeneralManager();

        //创建代理对象
        FinanceManagerProxy financeManagerProxy = new FinanceManagerProxy(generalManager);

        //开始代理执行工作
        financeManagerProxy.manageFinance();

    }
}
