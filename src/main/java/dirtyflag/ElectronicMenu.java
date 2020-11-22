package dirtyflag;


import java.util.Date;

public class ElectronicMenu {

    protected boolean isDirty = true;
    private String content;

    public void show(){
        if (isDirty) {
            update();
        }
        System.out.println("(" + this.toString() + ") : " + "(" + this.toString() + ") : ");
        System.out.println(content);
    }

    private void update(){
        System.out.println("(" + this.toString() + ") : " + "正在获取时间信息\n.\n.\n.\n");
        try {
            Thread.currentThread().sleep(3000);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        System.out.println("(" + this.toString() + ") : " + "更新完毕\n");
        Date date = new Date();
        content = String.format("更新时间：%tc", date);
        isDirty = false;
    }

    public void menuChange() {
        isDirty = true;
    }
}
