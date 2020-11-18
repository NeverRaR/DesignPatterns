package multition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Chair {
    private final int chairIndex;

    private static final Map<Integer,Chair> chairs;

    static{
        chairs = new ConcurrentHashMap<>();
        for(int i =0;i< 120;i++){
            chairs.put(i,new Chair(i));
        }
    }
    private Chair(int chairIndex) {
        this.chairIndex = chairIndex;
    }

    public static Chair getInstance(int index) {
        return chairs.get(index);
    }
    public Integer getIndex(){
        return chairIndex;
    }
    public String toString(){
        return "Chair: "+chairIndex;
    }
}
