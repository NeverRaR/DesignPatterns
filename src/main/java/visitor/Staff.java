package visitor;

public class Staff extends Employee {

    private final String employeeName;

    public Staff(String employeeName, Employee... children) {
        super(employeeName, children);
        this.employeeName = employeeName;
    }

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visitStaff(this);
        super.accept(visitor);
    }

    @Override
    public String toString() {
        return ("Staff" + " " + employeeName);
    }
}