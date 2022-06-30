import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public final class Monster {

    private final String name;
    private final String description;
    private int hitPoints;
    private final int minDamage;
    private final int maxDamage;
    private final static Random random = new Random();
    private final static Set<Integer> monstersSeen = new HashSet<Integer>();
    private final static int NUM_MONSTERS = 3;

    public static Monster newRandomInstance() {
        if (monstersSeen.size() == NUM_MONSTERS) {
            monstersSeen.clear();
        }
        int i;
        do {
            i = random.nextInt(NUM_MONSTERS);
        } while (monstersSeen.contains(i));
        monstersSeen.add(i);

        if (i == 0) {
            return new Monster("Harpy", Art.HARPY, 40, 8, 12);
        } else if (i == 1) {
            return new Monster("Gargoyle", Art.GARGOYLE, 26, 4, 6);
        } else {
            return new Monster("Hobgoblin", Art.HOBGOBLIN, 18, 1, 2);
        }
    }

    public static Monster newBossInstance() {
        return new Monster("Dragon", Art.DRAGON, 60, 10, 20);
    }

    private Monster(String name, String description, int hitPoints, int minDamage, int maxDamage) {
        this.name = name;
        this.description = description;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hitPoints = hitPoints;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return "Monster HP: " + hitPoints;
    }

    public int attack() {
        return random.nextInt(maxDamage - minDamage + 1) + minDamage;
    }

    public void defend(Player player) {
        int attackStrength = player.attack();
        hitPoints = (hitPoints > attackStrength) ? hitPoints - attackStrength : 0;
        System.out.printf("  %s hits %s for %d HP of damage (%s)\n", player, name, attackStrength,
                getStatus());
        if (hitPoints == 0) {
            System.out.println("  " + player + " transforms the skull of " + name
                    + " into a red pancake with his stone hammer");
        }
    }

    public boolean isAlive() {
        return hitPoints > 0;
    }

}