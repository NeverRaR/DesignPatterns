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
        System.out.print("(" + this.toString() + "): " + "visitStaff\n");
    }

    /**
     * @param viceManager VinceManager object
     */
    @Override
    public void visitViceManager(ViceManager viceManager) {
        System.out.print("(" + this.toString() + "): " + "visitViceManager\n");
    }

    /**
     * @param manager Manager object
     */
    @Override
    public void visitManager(Manager manager) {
        System.out.printf("(" + this.toString() + "): " + "***Hello %s***\n", manager);
    }
}
