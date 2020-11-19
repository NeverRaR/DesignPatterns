package prototype;

import org.junit.Test;

public class PrototypeTest {
    @Test
    public void main(){

        System.out.println("使用原型模式构建对象:");

        Ticket ticket = new Ticket(30,"2020-11-18","成人票");
        ticket.giftticket = new Ticket(0,"2020-11-18","赠票");//新建赠票对象

        System.out.println("----------------浅拷贝----------------");

        Ticket ticket1 = (Ticket)ticket.clone();
        Ticket ticket2 = (Ticket)ticket.clone();

        System.out.println("ticket1 : " + ticket1 + ", giftticket.hashCode=" + ticket1.giftticket.hashCode());
        System.out.println("ticket2 : " + ticket2 + ", giftticket.hashCode=" + ticket2.giftticket.hashCode());

        System.out.println("----------------深拷贝----------------");
        Ticket ticket3 = (Ticket)ticket.deepClone();
        System.out.println("ticket3 : " + ticket3 + ", giftticket.hashCode=" + ticket3.giftticket.hashCode());

    }

}
