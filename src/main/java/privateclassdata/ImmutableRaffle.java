package privateclassdata;

public class ImmutableRaffle {

    private final RaffleData data;

    /**
     * @Description: Constructor
     *
     * @param dogSledding: Number of times to play Dog Sledding
     * @param skiing: Number of times to play Skiing
     * @param bungeeJumping: Number of times to play Bungee Jumping
     * @param bigWheel: Number of times to play Big Wheel
     */
    public ImmutableRaffle(int dogSledding, int skiing, int bungeeJumping, int bigWheel) {
        data = new RaffleData(dogSledding, skiing, bungeeJumping, bigWheel);
    }

    /**
     *
     * @Description: checkout the current count
     */
    public void checkout() {
        System.out.print("ImmutableRaffle:getInstance:("+this.hashCode()+"): ");
        System.out.println("You've played " + data.getDogSledding() + " times of Dog Sledding, " +
                data.getSkiing() + " times of Skiing, " +
                data.getBungeeJumping() + " times of Bungee Jumping, " +
                data.getBigWheel() + " times of Big Wheel, "
        );
    }
}
