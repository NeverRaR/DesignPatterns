package memento;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author 1851594王思桐
 */
public class MementoTest extends TestCase {
    @Test
    public  void test() {
        /**
         * Initialize a GamePlayer to play tiao-jia chess.
         */
        GamePlayer gamePlayer = new GamePlayer();

        /**
         * Check its initial map.
         */
        System.out.println("MementoTest:\n\tInitialGameMap:");
        System.out.println("\n\t"+ gamePlayer.showBoard());

        /**
         * Play a single game.
         */
        gamePlayer.play();

        /**
         * Check the game map after playing.
         */
        System.out.println("\tAfter Playing:");
        System.out.println("\n\t"+ gamePlayer.showBoard());

        /**
         * Restart the gamePlayer to have another match
         * instead of delete the player and new anotherone .
         */
        gamePlayer.restart();

        /**
         * Check the game board again,
         * it should be reset to the initial board.
         */
        System.out.println("\t"+"After Restart:");
        System.out.println("\n\t"+ gamePlayer.showBoard());

        System.out.println("Exit MementoTest\n");

    }
}
