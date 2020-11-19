package command;

public class Command {
    public boolean up = true;

    public void putUp() {
        //处于放下状态
        if(up == false) {
            up = true;
            System.out.println("The protective props has been put up");
        }
        //处于架起状态
        else {
            System.out.println("The protective props cannot be put up as it has already been put up");
        }
    }
    public void putDown() {
        //处于架起状态
        if(up == true) {
            up = false;
            System.out.println("The protective props has been put down");
        }
        //处于放下状态
        else {
            System.out.println("The protective props cannot be put down as it has already been put down");
        }
    }
}
