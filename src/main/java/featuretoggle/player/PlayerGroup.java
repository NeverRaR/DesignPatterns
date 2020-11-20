package featuretoggle.player;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户选择赛道模式，包含障碍模式和竞速模式，选择后特定的用户组只能在对应赛道游玩
 */
public class PlayerGroup {
    private static List<Player> slalomGroup = new ArrayList<>();
    private static List<Player> raceGroup = new ArrayList<>();

    /**
     * 将玩家添加到免费组中
     *
     * @param player 传入用户
     * @throws IllegalArgumentException 当用户在障碍赛道中已经存在抛出异常
     */
    public static void addPlayerToRaceGroup(final Player player) throws IllegalArgumentException {
        if (slalomGroup.contains(player)) {
            throw new IllegalArgumentException("Player already in the Slalom Group");
        } else {
            if (!raceGroup.contains(player)) {
                raceGroup.add(player);
            }
        }
    }

    /**
     * 将玩家添加到障碍赛道
     *
     * @param player 添加用户
     * @throws IllegalArgumentException 当用户在竞速赛道中已经存在抛出异常
     */
    public static void addPlayerToSlalomGroup(final Player player) throws IllegalArgumentException {
        if (raceGroup.contains(player)) {
            throw new IllegalArgumentException("Player already in the Race Group");
        } else {
            if (!slalomGroup.contains(player)) {
                slalomGroup.add(player);
            }
        }
    }

    /**
     * @param player 传入用户
     * @return 若是劲速赛道玩家返回true，否则返回false
     */
    public static boolean isRaceGroup(Player player) {
        return raceGroup.contains(player);
    }
}
