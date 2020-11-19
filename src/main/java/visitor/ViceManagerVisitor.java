package visitor;

public class ViceManagerVisitor implements EmployeeVisitor {


    @Override
    public void visitStaff(Staff staff) {
        // Do nothing
    }

    @Override
    public void visitViceManager(ViceManager viceManager) {
        System.out.printf("Hello %s\n", viceManager);
    }

    @Override
    public void visitManager(Manager manager) {
        // Do nothing
    }
}
