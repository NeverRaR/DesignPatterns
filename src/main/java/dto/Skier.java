package dto;

public class Skier {
    //收到预处理处递送的打包好的订单，解开包裹进行料理
    public void receiveFoodPackage(SkitoolPackage preprocessed){
        System.out.println("(" + this.toString() + ") : " + "Got Package at time: " + preprocessed.getPreprocessedTime()
                .toString() + ", Ordered by: " + preprocessed.getOrderer() + ", including ingredients: \n" +
                preprocessed.ingredientToString());
        System.out.println("(" + this.toString() + ") : " + "Start Cooking!");
    }
}