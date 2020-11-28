package adapter;

/**
 * @author  NeverRaR
 */
public class Chair {
    /**
     * person is sitting in chair
     * @param person
     * person who sits
     */
    void sit(Adult person) {
        System.out.print("Chair:("+hashCode()+"):sit:");
        if(person.getAdultHeight()<1.5) System.out.println("You can't play this Facility!");
        else System.out.println("Have fun!");

    }
}
