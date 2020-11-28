package activeobject;

/**
 * @author  NeverRaR
 */
public interface ActiveObject {

    /**
     * solve complaint
     * @param message
     * message of complaint
     *
     * @return
     * result
     */
    Result solveEvent(String message);

    /**
     * end active object
     */
    void kill();
}
