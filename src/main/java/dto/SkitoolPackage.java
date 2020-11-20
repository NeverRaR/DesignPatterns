package dto;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;

public class SkitoolPackage {
    private ArrayList<Tools> tools = new ArrayList<>();
    private String orderedBy;
    private Timestamp preprocessedTime;

    //将滑雪用具进行格式化输出
    public String ingredientToString() {
        StringBuilder builder = new StringBuilder();
        for (Tools theTool: tools){
            builder.append("Skitool Name: ").append(theTool.name).append("; Price: ").append(theTool.price)
                    .append(" yuan; ").append("\n");
        }
        return builder.toString();
    }

    void pushTool(Tools next){
        tools.add(next);
    }

    ArrayList<Tools> getTools(){
        return tools;
    }

    //获得指定用具
    Tools getTool(int index){
        if (index >= 0 && index < tools.size()){
            return tools.get(index);
        }
        else{
            System.out.println("(" + this.toString() + ") : " + "Attempting to get a non-existing tool!");
            return null;
        }
    }

    void setOrderer(String newOrderedBy){
        orderedBy = newOrderedBy;
    }

    String getOrderer(){
        return orderedBy;
    }

    void setPreprocessedTime(Timestamp time){
        preprocessedTime = time;
    }

    Timestamp getPreprocessedTime(){
        return preprocessedTime;
    }
}
