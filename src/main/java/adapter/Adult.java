package adapter;

/**
 * @author  NeverRaR
 */
public class Adult {
    private double adultHeight=1.4;

    public Adult() {

    }

    public Adult(double adultHeight) {
        this.adultHeight=adultHeight;

    }

    /**
     * 获得成年人身高
     * @return
     * 身高
     */
    public double getAdultHeight() {
        return adultHeight;
    }

}
