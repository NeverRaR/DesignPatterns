package dirtyflag;

import org.junit.Test;

public class ElectronicUpdateTest {
    @Test
    public void test(){
        System.out.println("(" + this.toString() + ") : " + "Testing Dirty Flag");
        ElectronicMenu menu = new ElectronicMenu();
        System.out.println("(" + this.toString() + ") : " + "第一次访问");
        menu.show();
        System.out.println("(" + this.toString() + ") : " + "第二次访问");
        menu.show();
        System.out.println("(" + this.toString() + ") : " + "数据变更");
        menu.menuChange();
        System.out.println("(" + this.toString() + ") : " + "第三次访问");
        menu.show();
    }
}
