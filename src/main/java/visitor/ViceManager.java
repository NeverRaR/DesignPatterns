package visitor;

public class ViceManager extends Employee {

    private final String employeeName;

    public ViceManager(String employeeName, Employee... children) {
        super(employeeName, children);
        this.employeeName = employeeName;
    }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visitViceManager(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return ("Vince Manager" + " " + employeeName);
    }
}
