package mediator;

/**
 * @Title: Mother.java
 *
 * @Package mediator
 *
 * @Description: Inherits from GroupMemberBase, the mother class that overrides the toString()
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class Mother extends GroupMemberBase{

    private String name;

    /**
     * @Description: Consturct the class with certain name
     *
     * @param name: the name of the mother
     */
    public Mother(String name) {
        this.name = name;
    }

    /**
     * @Description: Override toString()
     *
     * @return Mother(this.name)
     */
    @Override
    public String toString() {
        return String.format("Mother(%s)", this.name);
    }

}