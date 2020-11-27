package dirtyflag;


import java.util.Date;

/**
 * ElectronicMenu to demonstrate dirty flag pattern
 */
public class ElectronicMenu {

    protected boolean isDirty = true;
    private String content;

    /**
     * show the electronic menu, update the menu if the flag is dirty
     */
    public void show(){
        if (isDirty) {
            update();
        }
        System.out.println("(" + this.toString() + ") : " + "(" + this.toString() + ") : ");
        System.out.println(content);
    }

    /**
     * function to update electronic menu
     */

    private void update(){
        System.out.println("(" + this.toString() + ") : " + "Getting time information\n");
        try {
            Thread.currentThread().sleep(1000);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        System.out.println("(" + this.toString() + ") : " + "Update completed\n");
        Date date = new Date();
        content = String.format("Update time：%tc", date);
        isDirty = false;
    }

    /**
     * make the flag "dirty" when menu needs to be changed
     */
    public void menuChange() {
        isDirty = true;
    }
}
