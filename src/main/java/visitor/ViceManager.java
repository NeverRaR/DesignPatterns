package visitor;

/**
 * @author nemo
 */
public class ViceManager extends Employee {
    private final String employeeName;
    /**
     * @param employeeName employee (employeeName) name to initialize
     * @param children children under current ViceManager object
     */
    public ViceManager(String employeeName, Employee... children) {
        super(employeeName, children);
        this.employeeName = employeeName;
    }
    /**
     * @param visitor EmployeeVisitor Object
     */
    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visitViceManager(this);
        super.accept(visitor);
    }
    /**
     * @return String: ViceManager with his name
     */
    @Override
    public String toString() {
        return ("Vince Manager" + " " + employeeName);
    }
}
