package visitor;

import java.util.Arrays;

/**
 * Interface for the nodes in hierarchy.
 */
public abstract class Employee {

    private final Employee[] children;
    private String employeeName;

    public Employee(String employeeName, Employee... children) {
        this.employeeName = employeeName;
        this.children = children;
    }

    /**
     * Accept visitor.
     */
    public void accept(EmployeeVisitor visitor) {
        Arrays.stream(children).forEach(child -> child.accept(visitor));
    }
}
