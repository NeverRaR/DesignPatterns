package markerinterface;

import junit.framework.TestCase;
import org.junit.Test;

public class MarkerInterfaceTest extends TestCase {
    @Test
    public void test(){
        Guard guard = new Guard();
        Thief thief = new Thief();

        System.out.println("("+this.toString()+") : "+"Class guard implements interface Permission so they have permission to enter");

        if(guard instanceof Permission){
            guard.enter();
        }else{
            System.out.println("(" + this.toString() + ") : " + "You have no permission to enter, " +
                    "please leave this area");
        }

        System.out.println("("+this.toString()+") : "+"Class thief doesn't implement interface Permission so they don't have permission to enter");
        if(thief instanceof Permission){
            thief.steal();
        }else{
            thief.doNothing();
        }
    }


}
