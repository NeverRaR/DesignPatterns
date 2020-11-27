package adapter;

/**
 * @author  NeverRaR
 */
public class Chair {
    /**
     * 人坐在椅子上
     * @param person
     * 坐下的人
     */
    void sit(Adult person) {
        System.out.print("Chair:("+hashCode()+"):sit:");
        if(person.getAdultHeight()<1.5) System.out.println("You can't play this Facility!");
        else System.out.println("Have fun!");

    }
}
