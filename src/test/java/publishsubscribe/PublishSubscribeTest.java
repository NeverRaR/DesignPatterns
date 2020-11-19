package publishsubscribe;

import org.junit.Test;
import proxy.FinanceManagerProxy;
import proxy.GeneralManager;

public class PublishSubscribeTest {
    @Test
    public  void main(){

        System.out.println("正在使用发布订阅者模式:");

        Application app =  new Application();

        ApplicationManagerController publisherController = new ApplicationManagerController(app);
        VistorController subscriberController = new VistorController(app);

        subscriberController.subscribe("游客1","冰雪滑道项目负责人");
        subscriberController.subscribe("游客2","动感影院项目负责人");
        subscriberController.subscribe("游客3","冰雪滑道项目负责人");

        publisherController.publish("冰雪滑道项目负责人","冰雪滑道项目开放时间为10:00-17:00");
        publisherController.publish("动感影院项目负责人","今日没有动感影院项目");

        System.out.println("---------------------------------------------------");
        subscriberController.unsubscribe("游客1","冰雪滑道项目负责人");
        publisherController.publish("冰雪滑道项目负责人","冰雪滑道项目开放时间调整为09:00-17:00");


    }
}
