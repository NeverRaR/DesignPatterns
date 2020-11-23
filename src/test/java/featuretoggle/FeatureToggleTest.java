package featuretoggle;

import featuretoggle.player.Player;
import featuretoggle.player.PlayerGroup;
import junit.framework.TestCase;
import org.junit.Test;

public class FeatureToggleTest extends TestCase {
    @Test
    public void test() {
        System.out.println("Test Feature Toggle: ");
        SkiingService service = new FeatureToggle();
        final Player player1 = new Player("Race_1");
        final Player player2 = new Player("Slalom_1");
        PlayerGroup.addPlayerToRaceGroup(player1);
        PlayerGroup.addPlayerToSlalomGroup(player2);

        service.showPlayerGroupMsg(player1);
        service.showPlayerGroupMsg(player2);
    }

}
