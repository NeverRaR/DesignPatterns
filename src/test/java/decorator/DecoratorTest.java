package decorator;

import junit.framework.TestCase;
import org.junit.Test;

public class DecoratorTest  {
    @Test
    public void main(){
        System.out.println("Test decorator:");
        VisitPackage visitPackage=new Ticket(200.0,"Enter the paradise and have fun");
        visitPackage=new BaseDecorator(visitPackage);
        visitPackage=new RollerCoasterDecorator(visitPackage);
        visitPackage=new BumperCarDecorator(visitPackage);
        visitPackage=new BumperCarDecorator(visitPackage);
        System.out.println("Visit Package price:"+visitPackage.getPrice());
        System.out.println("Visit Package content:"+visitPackage.getContent());

    }

}