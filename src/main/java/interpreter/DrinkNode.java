package interpreter;

public class DrinkNode extends Node{
    private String drinkName;
    private Integer num;
    private Integer unitPrice;

    @Override
    public void Interpret(Context context) {
        if(context.getCurToken()=="KCKL"){
            drinkName = "可口可乐";
            unitPrice = 3;
        }else if(context.getCurToken() == "NMC"){
            drinkName = "柠檬茶";
            unitPrice = 5;
        }else if(context.getCurToken() == "KQS"){
            drinkName = "矿泉水";
            unitPrice = 2;
        }
        context.nextToken();
        num = Integer.parseInt(context.getCurToken());
        context.nextToken();;
    }

    @Override
    public void Execute() {

        System.out.println("(" + this.toString() + ") : " + drinkName + "    " + "数量： " + num + "    总价： " + num * unitPrice + "\n");
    }
}
