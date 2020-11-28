package featuretoggle;

import featuretoggle.player.Player;
import featuretoggle.player.PlayerGroup;

/**
 * provide different additional functions according to the type of track selected by tourists
 * below is an example of how to display a simple welcome message
 */
public class FeatureToggle implements SkiingService {

    @Override
    public void showPlayerGroupMsg(Player player) {
        if (PlayerGroup.isRaceGroup(player)) {
            System.out.println("(" + this.toString() + "): " + String.format("%s Welcome to the Race Skiing! ", player.getName()));
        } else {
            System.out.println("(" + this.toString() + "): " + String.format("%s Welcome to the Slalom Skiing! ", player.getName()));
        }
    }
}
