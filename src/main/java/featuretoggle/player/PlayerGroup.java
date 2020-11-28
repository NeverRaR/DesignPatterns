package featuretoggle.player;

import java.util.ArrayList;
import java.util.List;

/**
 * player choose the track mode, including slalom mode and racing mode
 * after selection, specific player group can only play in the corresponding track
 */
public class PlayerGroup {
    private static List<Player> slalomGroup = new ArrayList<>();
    private static List<Player> raceGroup = new ArrayList<>();

    /**
     * Add player to free group
     *
     * @param player
     * @throws IllegalArgumentException throw exception when the player already exists in the slalom track
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
     * add player to slalom track
     *
     * @param player add player
     * @throws IllegalArgumentException throw exception when the player already exists in the racing track
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
     * @param player
     * @return true when the player is on racing track，otherwise return false
     */
    public static boolean isRaceGroup(Player player) {
        return raceGroup.contains(player);
    }
}
