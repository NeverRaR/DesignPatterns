package iterator;

import junit.framework.TestCase;
import org.junit.Test;

public class TouristTest extends TestCase {

    @Test
    public void test() {
        TouristsInLine line = new TouristsInLine();
        System.out.println("\n1# Iteration Test");
        TouristInLineIterator adultsIterator = line.iterator(TouristType.ADULTS);
        TouristInLineIterator anyIterator = line.iterator(TouristType.ANY);
        TouristInLineIterator militaryIterator = line.iterator(TouristType.MILITARY);

        System.out.println("\n1.1# Iterator of any kind");
        System.out.print("anyIterator:getInstance:("+anyIterator.hashCode()+"): ");
        while (anyIterator.hasNext()) {
            System.out.print(anyIterator.next().toString()+" ");
        }

        System.out.println("\n\n1.2# Iterator of adults");
        System.out.print("adultsIterator:getInstance:("+adultsIterator.hashCode()+"): ");
        while (adultsIterator.hasNext()) {
            System.out.print(adultsIterator.next().toString()+" ");
        }

        System.out.println("\n\n1.3# Iterator of military");
        System.out.print("militaryIterator:getInstance:("+militaryIterator.hashCode()+"): ");
        while (militaryIterator.hasNext()) {
            System.out.print(militaryIterator.next().toString()+" ");
        }

        System.out.println("\n\n\n2# Insert and Clear Test");
        System.out.println("\n2.1# Initial State");
        System.out.print("line:getInstance:("+line.hashCode()+"): ");
        System.out.println("Initial Size of the whole line: " + line.size());

        TouristInLineIterator childrenIterator = line.iterator(TouristType.CHILDREN);
        System.out.println("Initial Children in line: ");
        System.out.print("childrenIterator:getInstance:("+childrenIterator.hashCode()+"): ");
        while (childrenIterator.hasNext()) {
            System.out.print(childrenIterator.next().toString()+" ");
        }

        System.out.println("\n\n2.2# A child named \"Goodman\" starts lining up");
        line.append(TouristType.CHILDREN, "Goodman");

        System.out.print("line:getInstance:("+line.hashCode()+"): ");
        System.out.println("Updated Size of the whole line: " + line.size());

        TouristInLineIterator childrenIterator2 = line.iterator(TouristType.CHILDREN);
        System.out.println("Updated Children in line: ");
        System.out.print("childrenIterator2:getInstance:("+childrenIterator2.hashCode()+"): ");

        while (childrenIterator2.hasNext()) {
            System.out.print(childrenIterator2.next().toString()+" ");
        }

        System.out.println("\n\n2.3# Clear the the whole line");
        line.clear();
        System.out.print("line:getInstance:("+line.hashCode()+"): ");
        System.out.println("Cleared Size of the whole line: " + line.size());
    }
}
