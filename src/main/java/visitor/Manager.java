package visitor;

public class Manager extends Employee {

    private final String employeeName;

    public Manager(String employeeName, Employee... children) {
        super(employeeName, children);
        this.employeeName = employeeName;
    }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visitManager(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return ("Manager" + " " + employeeName);
    }
}