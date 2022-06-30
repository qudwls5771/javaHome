import java.util.Random;

public final class Player {

    private final String name;
    private final String description;
    private final int maxHitPoints;
    private int hitPoints;
    private int numPotions;
    private final int minDamage;
    private final int maxDamage;
    private final Random random = new Random();

    private Player(String name, String description, int maxHitPoints, int minDamage, int maxDamage,
            int numPotions) {
        this.name = name;
        this.description = description;
        this.maxHitPoints = maxHitPoints;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.numPotions = numPotions;
        this.hitPoints = maxHitPoints;
    }

    public int attack() {
        return random.nextInt(maxDamage - minDamage + 1) + minDamage;
    }

    public void defend(Monster monster) {
        int attackStrength = monster.attack();
        hitPoints = (hitPoints > attackStrength) ? hitPoints - attackStrength : 0;
        System.out.printf("  " + name + " is hit for %d HP of damage (%s)\n", attackStrength,
                getStatus());
        if (hitPoints == 0) {
            System.out.println("  " + name + " has been defeated");
        }
    }

    public void heal() {
        if (numPotions > 0) {
            hitPoints = Math.min(maxHitPoints, hitPoints + 20);
            System.out.printf("  %s drinks healing potion (%s, %d potions left)\n", name,
                    getStatus(), --numPotions);
        } else {
            System.out.println("  You've exhausted your potion supply!");
        }
    }

    public boolean isAlive() {
        return hitPoints > 0;
    }

    public String getStatus() {
        return "Player HP: " + hitPoints;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static Player newInstance() {
        return new Player("Mighty Thor",
                "a musclebound hulk intent on crushing all evil in his way", 40, 6, 20, 10);
    }
}