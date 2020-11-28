package dto;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 * @author Nam
 */
public class SkitoolPackage {
    private ArrayList<Tools> tools = new ArrayList<>();
    private String orderedBy;
    private Timestamp preprocessedTime;

    /**
     * Formatting Ski Tools for Export
     * @return The information of the ski tools
     */
    public String toolsToString() {
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

    /**
     * Obtain specified appliances.
     * @param index:
     * @return tools if get any tool
     *         null if get a non-existing tool
     */
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
