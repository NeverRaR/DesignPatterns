package publishsubscribe;

import org.junit.Test;
import proxy.FinanceManagerProxy;
import proxy.GeneralManager;

public class PublishSubscribeTest {
    @Test
    public void main(){

        System.out.println("正在使用发布订阅者模式:");

        Application app =  new Application();

        EntertainmentController entertainmentController = new EntertainmentController(app);
        VistorController subscriberController = new VistorController(app);

        //游客1、2订阅冰雪滑道项目，游客3订阅动感影院项目
        subscriberController.subscribe("游客1","冰雪滑道项目");
        subscriberController.subscribe("游客2","冰雪滑道项目");
        subscriberController.subscribe("游客3","动感影院项目");

        System.out.println("---------------------------------------------------");
        //冰雪滑道项目向所有订阅其的游客发布信息
        entertainmentController.publish("冰雪滑道项目","冰雪滑道项目开放时间为10:00-17:00");

        //动感影院项目向所有订阅其的游客发布信息
        entertainmentController.publish("动感影院项目","今日没有动感影院项目");

        System.out.println("---------------------------------------------------");

        //游客2取消订阅冰雪滑道项目
        subscriberController.unsubscribe("游客2","冰雪滑道项目");

        System.out.println("---------------------------------------------------");

        //冰雪滑道项目再次向所有订阅其的游客发布信息
        entertainmentController.publish("冰雪滑道项目","冰雪滑道项目开放时间调整为09:00-17:00");
        System.out.println("---------------------------------------------------");

        //游客1再次订阅冰雪滑道项目，会提示错误信息
        subscriberController.subscribe("游客1","冰雪滑道项目");

        //游客2再次取消订阅冰雪滑道项目，会提示错误信息
        subscriberController.unsubscribe("游客2","冰雪滑道项目");


    }
}
