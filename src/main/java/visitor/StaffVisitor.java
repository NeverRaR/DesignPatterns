package visitor;

/**
 * @author nemo
 */
public class StaffVisitor implements EmployeeVisitor {

    /**
     * @param staff Staff object
     */
    @Override
    public void visitStaff(Staff staff) {
        System.out.printf("(" + this.toString() + "): " + "***Greetings %s***\n", staff);
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
        // Do nothing
    }
}
