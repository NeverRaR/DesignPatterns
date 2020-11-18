package adapter;

public class Chair {
    void sit(Adult person) {
        if(person.getAdultHeight()<1.5) System.out.println("You can't play this Facility!");
        else System.out.println("Have fun!");

    }
}
