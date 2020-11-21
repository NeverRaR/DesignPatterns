package visitor;

/**
 *
 */
public interface EmployeeVisitor {

    /**
     * @param staff Staff object
     */
    void visitStaff(Staff staff);

    /**
     *
     * @param viceManager VinceManager object
     */
    void visitViceManager(ViceManager viceManager);

    /**
     *
     * @param manager Manager object
     */
    void visitManager(Manager manager);

}
