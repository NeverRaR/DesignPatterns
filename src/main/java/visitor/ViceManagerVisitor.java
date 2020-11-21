package visitor;

/**
 * @author nemo
 */
public class ViceManagerVisitor implements EmployeeVisitor {

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
        System.out.printf("Hello %s\n", viceManager);
    }

    /**
     * @param manager Manager object
     */
    @Override
    public void visitManager(Manager manager) {
        // Do nothing
    }
}
