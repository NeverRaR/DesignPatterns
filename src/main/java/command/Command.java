package command;

/**
 * define Command class, which changes and prints state of protective props according to two kinds of command
 * @author 1853615邓斯语
 */
public class Command {

    public boolean up = true;

    /**
     * change the state of protective props to up and print
     */
    public void putUp() {
        //when the state of protective props is down
        if(up == false) {
            up = true;
            System.out.println("Command: putUp: The protective props has been put up");
        }
        //when the state of protective props is up
        else {
            System.out.println("Command: putUp: The protective props cannot be put up as it has already been put up");
        }
    }

    /**
     * change the state of protective props to down and print
     */
    public void putDown() {
        //when the state of protective props is up
        if(up == true) {
            up = false;
            System.out.println("Command: putDown: The protective props has been put down");
        }
        //when the state of protective props is down
        else {
            System.out.println("Command: putDown: The protective props cannot be put down as it has already been put down");
        }
    }
}
