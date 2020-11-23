package mediator;

/**
 * @Title: TourGuides.java
 *
 * @Package mediator
 *
 * @Description: Inherits from GroupMemberBase, the TourGuides class that overrides the toString()
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class TourGuides extends GroupMemberBase{

    private String name;

    /**
     * @Description: Override toString()
     *
     * @return TourGuides(this.name)
     */
    public TourGuides(String name) {
        this.name = name;
    }

    /**
     * @Description: Override toString()
     *
     * @return TourGuides(this.name)
     */
    @Override
    public String toString() {
        return String.format("TourGuides(%s)", this.name);
    }

}