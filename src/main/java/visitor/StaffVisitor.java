package visitor;

public class StaffVisitor implements EmployeeVisitor {


    @Override
    public void visitStaff(Staff staff) {
        System.out.printf("Greetings %s\n", staff);
    }

    @Override
    public void visitViceManager(ViceManager viceManager) {
        // Do nothing
    }

    @Override
    public void visitManager(Manager manager) {
        // Do nothing
    }
}
