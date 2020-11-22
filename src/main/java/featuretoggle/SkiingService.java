package featuretoggle;

import featuretoggle.player.Player;

public interface SkiingService {
    /**
     * @param player 传入要进行滑雪的玩家
     */
    void showPlayerGroupMsg(Player player);
}
