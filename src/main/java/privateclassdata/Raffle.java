package privateclassdata;

/**
 * @Title: Raffle.java
 * 
 * @Package privateclassdata
 * 
 * @Description: Raffle basic, Count the number of times you play and redeem the prize
 * 
 * @author Jiajie
 * 
 * @date 2020/11/28
 */
public class Raffle {

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
    public Raffle(int dogSledding, int skiing, int bungeeJumping, int bigWheel) {
        this.dogSledding = dogSledding;
        this.skiing = skiing;
        this.bungeeJumping = bungeeJumping;
        this.bigWheel = bigWheel;
    }

    /**
     *
     * @Description: checkout the current count
     */
    public void checkout() {
        System.out.print("Raffle:getInstance:("+this.hashCode()+"): ");
        System.out.println("You've played " + this.dogSledding + " times of Dog Sledding, " +
                this.skiing + " times of Skiing, " +
                this.bungeeJumping + " times of Bungee Jumping, " +
                this.bigWheel + " times of Big Wheel, "
        );
    }

    /**
     *
     * @Description: redeem the prize
     */
    public void redeem() {
        System.out.print("Raffle:getInstance:("+this.hashCode()+"): ");
        int count = 0 ;
        if (this.dogSledding > 0) {
            count++;
            this.dogSledding--;
        }
        if (this.skiing > 0) {
            count++;
            this.skiing--;
        }
        if (this.bungeeJumping > 0) {
            count++;
            this.bungeeJumping--;
        }
        if (this.bigWheel > 0) {
            count++;
            this.bigWheel--;
        }
        if ( count == 4 )
            System.out.println("The prize was redeemed.");
        else System.out.println("Failed to cash in.");
    }
}
