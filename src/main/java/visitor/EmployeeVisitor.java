package visitor;

public interface EmployeeVisitor {

    void visitStaff(Staff staff);

    void visitViceManager(ViceManager viceManager);

    void visitManager(Manager manager);

}
