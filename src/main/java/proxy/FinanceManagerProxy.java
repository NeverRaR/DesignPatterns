package proxy;

public class FinanceManagerProxy implements IFinanceManager{

    private  IFinanceManager target;//目标对象

    public FinanceManagerProxy(IFinanceManager target){
        this.target=target;
    }
    @Override
    public void manageFinance() {
        System.out.println("代理开始...");
        target.manageFinance();
        System.out.println("代理结束...");
    }
}
