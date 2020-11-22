package multition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * @author 1851594王思桐
 */
public final class ChairMultition {
    private final int chairIndex;

    private static final Map<Integer, ChairMultition> chairs;

    static{
        chairs = new ConcurrentHashMap<>();
        for(int i =0;i< 120;i++){
            chairs.put(i,new ChairMultition(i));
        }
    }
    private ChairMultition(int chairIndex) {
        this.chairIndex = chairIndex;
    }

    public static ChairMultition getInstance(int index) {
        return chairs.get(index);
    }
    public Integer getIndex(){
        return chairIndex;
    }
    public String getInfo(){
        return this+":ChairIndex:"+chairIndex;
    }
}
