package dto;

import java.sql.Timestamp;

/**
 * author Nam
 */
public class Preprocessing {

    private Skier skier;

    /**
     * Distribute tools to skiers
     */
    void establishPipe(Skier newSkier){
        skier = newSkier;
    }

    /**
     * Processing,and pass to pre-processing.
     * @param orderedBy : String,orders placed by skiers to buy ski equipment.
     * @param tool : Ski equipment.
     */
    void preprocess(String orderedBy, Tools... tool){
        System.out.println("(" + this.toString() + ") : " + "Got order from: " + orderedBy);
        System.out.println("(" + this.toString() + ") : " + "Start Packaging and Preprocessing");
        SkitoolPackage pack = new SkitoolPackage();
        pack.setOrderer(orderedBy);
        for (Tools theTool: tool){
            pack.pushTool(theTool);
        }
        System.out.println("(" + this.toString() + ") : " + "get tools: \n" + pack.toolsToString());
        pack.setPreprocessedTime(new Timestamp(System.currentTimeMillis()));
        sendPackage(skier, pack);
    }

    /**
     * Deliver Packaged Objects.
     * @param newSkier : Skiers who placed an order.
     * @param pack : The ski tool Package received by skier.
     */
    private void sendPackage(Skier newSkier, SkitoolPackage pack){
        skier.receiveFoodPackage(pack);
    }
}
