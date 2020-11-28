package privateclassdata;

import org.junit.Test;

public class RaffleTest {

    @Test
    public void main() {
        Raffle raffle = new Raffle(1, 2, 3, 4);
        raffle.checkout();
        raffle.redeem();
        raffle.checkout();
        raffle.redeem();

        ImmutableRaffle immutableRaffle = new ImmutableRaffle(1, 2, 3, 4);
        immutableRaffle.checkout();
    }
}
