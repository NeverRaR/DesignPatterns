package featuretoggle;

import featuretoggle.player.Player;

public interface SkiingService {
    /**
     * @param player the player who wants to ski
     */
    void showPlayerGroupMsg(Player player);
}
