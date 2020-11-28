package privateclassdata;

public class RaffleData {

    private int dogSledding;
    private int skiing;
    private int bungeeJumping;
    private int bigWheel;

    /**
     * @Description: Constructor
     *
     * @param dogSledding: Number of times to play Dog Sledding
     * @param skiing: Number of times to play Skiing
     * @param bungeeJumping: Number of times to play Bungee Jumping
     * @param bigWheel: Number of times to play Big Wheel
     */
    public RaffleData(int dogSledding, int skiing, int bungeeJumping, int bigWheel) {
        this.dogSledding = dogSledding;
        this.skiing = skiing;
        this.bungeeJumping = bungeeJumping;
        this.bigWheel = bigWheel;
    }

    /**
     *
     * @ Description: get method
     *
     * @return Number of times to play Dog Sledding
     */
    public int getDogSledding() {
        return dogSledding;
    }

    /**
     *
     * @ Description: get method
     *
     * @return Number of times to play Skiing
     */
    public int getSkiing() {
        return skiing;
    }

    /**
     *
     * @ Description: get method
     *
     * @return Number of times to play Bungee Jumping
     */
    public int getBungeeJumping() {
        return bungeeJumping;
    }

    /**
     *
     * @ Description: get method
     *
     * @return Number of times to play Big Wheel
     */
    public int getBigWheel() {
        return bigWheel;
    }

}
