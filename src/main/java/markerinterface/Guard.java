package markerinterface;

/**
 * Guard implements interface Permission so it has permission
 */
public class Guard implements Permission{
    public Guard(){};

    public void enter(){
        System.out.println("("+this.toString()+") : "+"To guard: You can enter");
    }
}
