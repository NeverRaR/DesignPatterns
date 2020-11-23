package visitor;

/**
 * @author nemo
 */
public class Staff extends Employee {

    private final String employeeName;

    /**
     * @param employeeName employee (staff) name to initialize
     * @param children children under current Staff object
     */
    public Staff(String employeeName, Employee... children) {
        super(employeeName, children);
        this.employeeName = employeeName;
    }

    /**
     * @param visitor EmployeeVisitor Object
     */
    @Override
    public void accept(EmployeeVisitor visitor) {
        System.out.println(
            String.format(
                "(" +
                this.toString() +
                ", " +
                super.toString() +
                "): " +
                "accept and begin to visit."
            )
        );
        visitor.visitStaff(this);
        System.out.println(
            String.format(
                "(" +
                this.toString() +
                ", " +
                super.toString() +
                "): " +
                "visit complete, continue to next (if any)"
            )
        );
        super.accept(visitor);
        System.out.println(
            String.format(
                "(" +
                this.toString() +
                ", " +
                super.toString() +
                "): " +
                "accept complete."
            )
        );
    }

    /**
     * @return String: Staff with his name
     */
    @Override
    public String toString() {
        return ("Staff" + " " + employeeName);
    }
}
