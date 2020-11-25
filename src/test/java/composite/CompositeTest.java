package composite;

import junit.framework.TestCase;
import org.junit.Test;

public class CompositeTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Test composite pattern:");
        //create employees and their info, all details can be changed
        Employee CEO = new Employee("Dri","CEO","Run", 110, 20);
        Employee manager1 = new Employee("Lhc","Manager","Manage", 10, 20);
        Employee manager2 = new Employee("Zyy","Manager","Manage", 10, 20);
        Employee staff1 = new Employee("Lsq","Staff","Facility", 1, 20);
        Employee staff2 = new Employee("Wyj","Staff","Environment", 1, 20);
        //form a subordinate list, all details can be changed
        CEO.add(manager1);
        CEO.add(manager2);
        manager1.add(staff1);
        manager2.add(staff2);
        CEO.remove(manager1);                    //just for different situations test
        //only three levels, then just use two for loop to print the list
        System.out.println("CompositeTest: " + CEO);
        for (Employee emp : CEO.getEmployeeList()) {
            System.out.println("CompositeTest: " + emp);
            for (Employee employee : emp.getEmployeeList()) {
                System.out.println("CompositeTest: " + employee);
            }
        }
    }
}
