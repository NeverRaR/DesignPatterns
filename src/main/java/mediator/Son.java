package mediator;

/**
 * @Title: Son.java
 *
 * @Package mediator
 *
 * @Description: Inherits from GroupMemberBase, the son class that overrides the toString()
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class Son extends GroupMemberBase{

    private String name;

    /**
     * @Description: Override toString()
     *
     * @return Son(this.name)
     */
    public Son(String name) {
        this.name = name;
    }

    /**
     * @Description: Override toString()
     *
     * @return Son(this.name)
     */
    @Override
    public String toString() {
        return String.format("Son(%s)", this.name);
    }

}
