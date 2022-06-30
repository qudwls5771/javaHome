import java.io.IOException;

public final class Game {

    private final Player player = Player.newInstance();

    public void play() throws IOException {
        System.out.println("당신은" + player + " " + player.getDescription());
        Dungeon.newInstance().startQuest(player);
    }

    public static void main(String[] args) throws IOException {
        Game game = new Game();
        game.play();
    }

}