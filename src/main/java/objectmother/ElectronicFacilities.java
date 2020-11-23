package objectmother;

/**
 * @Title: ElectronicFacilities.java
 *
 * @Package objectmother
 *
 * @Description: the implementation of Facilities
 *
 * @author Jiajie
 *
 * @date 2020/11/24
 */
public class ElectronicFacilities implements Facilities{

    private boolean isDamaged = false;
    private boolean isClosed = false;
    private boolean isPowered = true;

    /**
     *
     * @Description: make the Facility damaged
     */
    @Override
    public void makeDameged() {
        isDamaged = true;
    }

    /**
     *
     * @Description: make the Facility repaired
     */
    @Override
    public void makeRepaired() {
        isDamaged = false;
    }

    /**
     *
     * @Description: make the Facility open
     */
    @Override
    public void makeOpen() {
        isClosed = false;
    }

    /**
     *
     * @Description: make the Facility closed
     */
    @Override
    public void makeClosed() {
        isClosed = true;
    }

    /**
     *
     * @Description: make the Facility power on
     */
    public void makePowerOn() {
        isPowered = true;
    }

    /**
     *
     * @Description: make the Facility power off
     */
    public void makePowerOff() {
        isPowered = false;
    }

    /**
     * @Description: check the Facility if it is damaged
     *
     * @return: isDamaged
     */
    public boolean isDamaged() {
        return isDamaged;
    }

    /**
     * @Description: check the Facility if it is closed
     *
     * @return: isClosed
     */
    public boolean isClosed() {
        return isClosed;
    }

    /**
     * @Description: check the Facility if it is powered
     *
     * @return: isPowered
     */
    public boolean isPowered() {
        return isPowered;
    }

    /**
     *
     * @Description: try to enter the facility
     */
    public void enter() {
        if (isClosed) {
            System.out.println("This facility is now malfunctioning and is really under repair!");
        }
        else {
            System.out.println("Enter to play happily in the facility!");
        }
    }
}
