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
        System.out.print("(" + this.toString() + "): " + "visitStaff\n");
    }

    /**
     * @param viceManager VinceManager object
     */
    @Override
    public void visitViceManager(ViceManager viceManager) {
        System.out.printf(
            "(" + this.toString() + "): " + "***Hello %s***\n",
            viceManager
        );
    }

    /**
     * @param manager Manager object
     */
    @Override
    public void visitManager(Manager manager) {
        System.out.print("(" + this.toString() + "): " + "visitManager\n");
    }
}
