import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Battle {

    public Battle(Player player, Monster monster) throws IOException {
        System.out.println("You encounter " + monster + ": " + monster.getDescription() + "\n");
        System.out.println("Battle with " + monster + " starts (" + player.getStatus() + " / "
                + monster.getStatus() + ")");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (player.isAlive() && monster.isAlive()) {
            System.out.print("Attack (a) or heal (h)? ");
            String action = in.readLine();
            if (action.equals("h")) {
                player.heal();
            } else {
                monster.defend(player);
            }
            if (monster.isAlive()) {
                player.defend(monster);
            }
        }
    }

}