package publishsubscribe;

/**
 * @author 1754025徐菡志
 */

public class Information {

    public String information;

    /**
     * The constructor of Information Class.
     * @param info:The content of the message.
     */
    public Information(String info) {
        this.information = info;
    }

    /**
     * Get the content of information
     * @return information: the content of information.
     */
    public String getInformation(){
        return information;
    }

}
