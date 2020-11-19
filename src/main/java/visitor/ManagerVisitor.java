package visitor;

public class ManagerVisitor implements EmployeeVisitor {


    @Override
    public void visitStaff(Staff staff) {
        // Do nothing
    }

    @Override
    public void visitViceManager(ViceManager viceManager) {
        // Do nothing
    }

    @Override
    public void visitManager(Manager manager) {
        System.out.printf("Hello %s\n", manager);
    }
}