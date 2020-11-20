package publishsubscribe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//游乐园的App，即发布订阅中心
public class Application implements IApplication{

        private static Map<String, Set<String>> AppMap;//存放所有发布者所对应的订阅者群

        static{
                AppMap = new HashMap<>();
        }

        @Override
        public String subscribe(Entertainment entertainment, Vistor vistor){

                try{
                        //获取存储订阅当前项目的所有游客的集合
                        Set<String> vistorSet = AppMap.get(entertainment.getName());
                        if(vistorSet==null){
                                vistorSet = new HashSet<>();
                        }

                        //向集合中加入新的订阅游客
                        if(vistorSet.add(vistor.getName())){
                                //添加成功则对订阅者群进行更新
                                AppMap.put(entertainment.getName(),vistorSet);
                                return "订阅成功！["+vistor.getName()+"]"+"已订阅了"+"["+entertainment.getName()+"]信息";
                        }
                        else{
                                //添加失败则证明该项目的订阅者群中已经存在了该订阅者
                                return "订阅失败！["+vistor.getName()+"]"+"已订阅过"+"["+entertainment.getName()+"]信息";
                        }
                }catch(Exception e){
                        e.printStackTrace();
                }
                return "订阅失败！未知错误！";
        }

        @Override
        public String unsubscribe(Entertainment entertainment, Vistor vistor) {

                try{
                        //获取存储订阅当前项目的所有游客的集合
                        Set<String> vistorSet = AppMap.get(entertainment.getName());
                        if(vistorSet==null){
                                vistorSet = new HashSet<>();
                        }

                        //向集合中加入新的订阅游客
                        if(vistorSet.remove(vistor.getName())){
                                //删除成功则对订阅者群进行更新
                                AppMap.put(entertainment.getName(),vistorSet);
                                return "取消订阅成功！["+vistor.getName()+"]"+"已取消订阅了"+"["+entertainment.getName()+"]信息";
                        }
                        else{
                                //删除失败则证明该游客没有订阅此项目信息
                                return "取消订阅失败！["+vistor.getName()+"]"+"还未订阅过"+"["+entertainment.getName()+"]信息";
                        }
                }catch (Exception e){
                        e.printStackTrace();
                }
                return "取消订阅失败！未知错误！";
        }

        @Override
        public void publish(Entertainment entertainment, Information info){
                Set<String> subscriberSet =  AppMap.get(entertainment.getName());
                for (String subscriber : subscriberSet) {
                        System.out.println("向订阅了[" + entertainment.getName()
                                +"]的游客[" + subscriber + "]发送消息: " +  info.getInformation());
                }
        }

}
