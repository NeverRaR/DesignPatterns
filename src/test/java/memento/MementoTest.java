package memento;

public class MementoTest {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("initial:");
        System.out.println(game.showMap());

        game.Play();
        System.out.println("After Playing:");
        System.out.println(game.showMap());
        game.Restart();
        System.out.println("After Restart:");
        System.out.println(game.showMap());
    }
}
