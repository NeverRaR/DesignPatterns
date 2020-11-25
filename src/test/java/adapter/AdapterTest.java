package adapter;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Scanner;

public class AdapterTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Test adapter:");
        Adult man=new Adult(1.8);
        Child boy=new Child(1.4);
        Child littleBoy=new Child(0.8);
        Chair chair=new Chair();
        System.out.println("A man sit:");
        chair.sit(man);
        //chair.sit(boy);
        ChildAdapter boyAdapter=new ChildAdapter(boy);
        ChildAdapter littleBoyAdapter=new ChildAdapter(littleBoy);
        System.out.println("A boy sit:");
        chair.sit(boyAdapter);
        System.out.println("A little boy sit:");
        chair.sit(littleBoyAdapter);

    }

}