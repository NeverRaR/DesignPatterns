package visitor;

/**
 * @author nemo
 */
public class ManagerVisitor implements EmployeeVisitor {

    /**
     * @param staff Staff object
     */
    @Override
    public void visitStaff(Staff staff) {
        // Do nothing
    }

    /**
     * @param viceManager VinceManager object
     */
    @Override
    public void visitViceManager(ViceManager viceManager) {
        // Do nothing
    }

    /**
     * @param manager Manager object
     */
    @Override
    public void visitManager(Manager manager) {
        System.out.printf("Hello %s\n", manager);
    }
}
