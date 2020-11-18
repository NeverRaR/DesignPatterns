package publishsubscribe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//游乐园的App，即发布订阅中心
public class Application implements IApplication{

        private static Map<String, Set<String>> PubSubMap ;  //存放所有的发布者的对应订阅者。

        static{
                PubSubMap = new HashMap<>();
        }

        public boolean subscribe(ApplicationManager publisher, Vistor subscriber){

                try{
                        Set<String>  subscriberSet = PubSubMap.get(publisher.getName()); //拿到当前发布者的所有订阅者
                        if(subscriberSet == null)  //为空，之前不存在订阅者
                                subscriberSet = new HashSet<>();
                        boolean added = subscriberSet.add(subscriber.getName()); //添加订阅者
                        if(added)  //添加订阅者成功。
                                return PubSubMap.put(publisher.getName(),subscriberSet) != null;
                        return false;  //订阅者添加失败或者该订阅之前则订阅了发布者
                }catch(Exception e){
                        e.printStackTrace();
                }
                return false;
        }

        @Override
        public boolean unsubscribe(ApplicationManager publisher, Vistor subscriber) {

                try{
                        Set<String>  subscriberSet = PubSubMap.get(publisher.getName());
                        if(subscriberSet == null)
                                return false;
                        boolean removed = subscriberSet.remove(subscriber.getName());       //删除取消订阅者
                        if(removed)
                                PubSubMap.put(publisher.getName(),subscriberSet); //更新订阅者列表
                        return removed;
                }catch (Exception e){
                        e.printStackTrace();
                }

                return false;
        }



        public void publish(ApplicationManager publisher, Information info){
                Set<String> subscriberSet =  PubSubMap.get(publisher.getName());

                //遍历订阅者发送消息。
                for (String subscriber:
                        subscriberSet) {
                        System.out.println("向发布者[" + publisher.getName()
                                +"]的订阅者[" + subscriber + "]发送消息: " +  info.getInformation());
                }
        }

}
