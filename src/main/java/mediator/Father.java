package mediator;
/**
 * @Title: Father.java
 *
 * @Package mediator
 *
 * @Description: Inherits from GroupMemberBase, the father class that overrides the toString()
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class Father extends GroupMemberBase{

    private String name;

    /**
     * @Description: Consturct the class with certain name
     *
     * @param name: the name of the father
     */
    public Father(String name) {
        this.name = name;
    }

    /**
     * @Description: Override toString()
     *
     * @return Father(this.name)
     */
    @Override
    public String toString() {
        return String.format("Father(%s)", this.name);
    }

}
