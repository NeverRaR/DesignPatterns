package dto;

import java.sql.Timestamp;

public class Preprocessing {

    private Skier skier;

    //分给滑雪者
    void establishPipe(Skier newSkier){
        skier = newSkier;
    }

    //进行处理，传入预处理处
    void preprocess(String orderedBy, Tools... tool){
        //making package
        System.out.println("(" + this.toString() + ") : " + "Got order from: " + orderedBy);
        System.out.println("(" + this.toString() + ") : " + "Start Packaging and Preprocessing");
        SkitoolPackage pack = new SkitoolPackage();
        pack.setOrderer(orderedBy);
        for (Tools theTool: tool){
            pack.pushTool(theTool);
        }
        System.out.println("(" + this.toString() + ") : " + "get tools: \n" + pack.ingredientToString());
        //add timestamp
        pack.setPreprocessedTime(new Timestamp(System.currentTimeMillis()));
        sendPackage(skier, pack);
    }
    //递送打包好的对象
    private void sendPackage(Skier newSkier, SkitoolPackage pack){
        skier.receiveFoodPackage(pack);
    }
}
