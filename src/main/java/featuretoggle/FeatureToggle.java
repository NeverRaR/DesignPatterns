package featuretoggle;

import featuretoggle.player.Player;
import featuretoggle.player.PlayerGroup;

/**
 * 根据游客选择的赛道种类，提供不同的额外功能
 * 下面通过实现一个显示简单的欢迎信息的方法作为例子
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
