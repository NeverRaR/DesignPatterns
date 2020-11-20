package delegation;

public class Tourists implements BuyTicket{
    public void buyticket(String ticket){
        //Tourist购票，输出购票的信息
        System.out.println("The tourist buys : "+ticket);
    }
}