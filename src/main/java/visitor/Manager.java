package visitor;

/**
 * @author nemo
 */
public class Manager extends Employee {

    private final String employeeName;

    /**
     * @param employeeName employee (manager) name to initialize
     * @param children children under current Manager object
     */
    public Manager(String employeeName, Employee... children) {
        super(employeeName, children);
        this.employeeName = employeeName;
    }

    /**
     * @param visitor EmployeeVisitor Object
     */
    @Override
    public void accept(EmployeeVisitor visitor) {
        System.out.println(String.format("(" + this.toString() + ", " + super.toString() + "): " + "accept and begin to visit."));
        visitor.visitManager(this);
        System.out.println(String.format("(" + this.toString() + ", " + super.toString() + "): " + "visit complete, continue to next (if any)"));
        super.accept(visitor);
        System.out.println(String.format("(" + this.toString() + ", " + super.toString() + "): " + "accept complete."));
    }

    /**
     *
     * @return String: Manager with his name
     */
    @Override
    public String toString() {
        return ("Manager" + " " + employeeName);
    }
}
