package dirtyflag;

import junit.framework.TestCase;
import org.junit.Test;

public class ElectronicUpdateTest extends TestCase {
    @Test
    public void test(){
        System.out.println("(" + this.toString() + ") : " + "Testing Dirty Flag");
        ElectronicMenu menu = new ElectronicMenu();
        System.out.println("(" + this.toString() + ") : " + "First time: Get Menu");
        menu.show();
        System.out.println("(" + this.toString() + ") : " + "Second time: Get Menu");
        menu.show();
        System.out.println("(" + this.toString() + ") : " + "MenuChange!");
        menu.menuChange();
        System.out.println("(" + this.toString() + ") : " + "Third time: Get Menu");
        menu.show();
    }
}
