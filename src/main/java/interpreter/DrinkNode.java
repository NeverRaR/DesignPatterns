package interpreter;


public class DrinkNode extends Node{
    private String drinkName;
    private Integer num;
    private Integer unitPrice;

    /**
     * Interpreter for drink node
     * @param context
     */
    @Override
    public void interpret(Context context) {
        if(context.getCurToken()=="KCKL"){
            drinkName = "Cola";
            unitPrice = 3;
        }else if(context.getCurToken() == "NMC"){
            drinkName = "Tea";
            unitPrice = 5;
        }else if(context.getCurToken() == "KQS"){
            drinkName = "Water";
            unitPrice = 2;
        }
        context.nextToken();
        num = Integer.parseInt(context.getCurToken());
        context.nextToken();;
    }

    /**
     * execute the total price of the drink
     */
    @Override
    public void execute() {

        System.out.println("(" + this.toString() + ") : " + drinkName + "    " + "Quantity： " + num + "    Total price： " + num * unitPrice + "\n");
    }
}
