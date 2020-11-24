package publishsubscribe;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author 1754025徐菡志
 */

public class Application implements IApplication{

        private static Map<String, Set<String>> AppMap;

        static{
                AppMap = new HashMap<>();
        }

        /**
         * The constructor of Application Class.
         */
        public Application(){
                System.out.println(this.getClass().getSimpleName()+":("+this.hashCode()+"):Application():create the object of Application successfully.");
        }

        /**
         * Perform subscription operations.
         * @param entertainment: the entertainment that will be subscribed.
         * @param visitor: the visitor who wants to subscribe entertainment.
         */
        @Override
        public void subscribe(Entertainment entertainment, Visitor visitor){

                try{
                        //Get the collection of all visitors who have subscribed to the current item.
                        Set<String> visitorSet = AppMap.get(entertainment.getName());
                        if(visitorSet==null){
                                visitorSet = new HashSet<>();
                        }

                        //Add new subscribers to the collection.
                        if(visitorSet.add(visitor.getName())){
                                AppMap.put(entertainment.getName(),visitorSet);

                                System.out.println(this.getClass().getSimpleName()+":("+
                                        this.hashCode()+"):subscribe():"+
                                        "Subscribed successfully!"+
                                        " ["+visitor.getName()+"] "+"has subscribed to"+" ["+entertainment.getName()+"] information.");
                        }
                        else{
                                System.out.println(this.getClass().getSimpleName()+":("+
                                        this.hashCode()+"):subscribe():"+
                                        "Failed to subscription!"+
                                        " ["+visitor.getName()+"] "+"has subscribed to"+" ["+entertainment.getName()+"]information before!");
                        }
                }catch(Exception e){
                        e.printStackTrace();
                }
        }

        /**
         * Perform unsubscription operations.
         * @param entertainment: the entertainment that will be unsubscribed.
         * @param visitor: the visitor who wants to unsubscribe entertainment.
         */
        @Override
        public void unsubscribe(Entertainment entertainment, Visitor visitor) {

                try{
                        //Get the collection of all visitors who have subscribed to the current item.
                        Set<String> vistorSet = AppMap.get(entertainment.getName());
                        if(vistorSet==null){
                                vistorSet = new HashSet<>();
                        }

                        //Delete the corresponding visitor from the collection.
                        if(vistorSet.remove(visitor.getName())){
                                AppMap.put(entertainment.getName(),vistorSet);

                                System.out.println(this.getClass().getSimpleName()+":("+
                                        this.hashCode()+"):unsubscribe():"+
                                        "Unsubscribed successfully!"+
                                        " ["+visitor.getName()+"] "+"has unsubscribed to "+"["+entertainment.getName()+"] information.");
                        }
                        else{
                                System.out.println(this.getClass().getSimpleName()+":("+
                                        this.hashCode()+"):unsubscribe():"+
                                        "Failed to unsubscription!"+
                                        " ["+visitor.getName()+"] "+"has not subscribed to "+"["+entertainment.getName()+"] information.");
                        }
                }catch (Exception e){
                        e.printStackTrace();
                }
        }

        /**
         * Perform publish operations.
         * @param entertainment: the entertainment to publish information.
         * @param info: the information that will be published.
         */
        @Override
        public void publish(Entertainment entertainment, Information info){
                Set<String> subscriberSet = AppMap.get(entertainment.getName());
                for (String subscriber : subscriberSet) {
                        System.out.println(this.getClass().getSimpleName()+
                                ":("+
                                this.hashCode()+
                                "):publish():"+
                                "Send a message to "+"["+
                                subscriber +"]"+
                                " who have subscribed to "+"["+
                                entertainment.getName() +"]"+
                                ":\"" +
                                info.getInformation()+"\".");
                }
        }

}
