package markerinterface;

/**
 * Thief class doesn't implement interface Permission
 */
public class Thief {
    protected void steal(){
        System.out.println("("+this.toString()+") : "+"To thief: Steal valuable items");
    }

    protected void doNothing(){
        System.out.println("("+this.toString()+") : "+"To thief: Pretend nothing happened and just leave");
    }

}
