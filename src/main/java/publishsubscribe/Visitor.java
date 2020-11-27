package publishsubscribe;

public class Visitor {
    String name;

    /**
     * The constructor of Visitor Class.
     * @param name:the name of the visitor.
     */
    public Visitor(String name){
        this.name = name;
    }

    /**
     * Get the name of visitor.
     * @return name : the name of visitor.
     */
    public String getName(){
        return name;
    }
}
