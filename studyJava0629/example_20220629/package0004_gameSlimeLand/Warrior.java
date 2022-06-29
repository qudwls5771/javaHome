package package0004_gameSlimeLand;

public class Warrior {
    public String name;
    public int hp;
    public int mp;
    public int attRang;

    public Warrior(String input_name, int input_hp, int input_mp) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
        this.attRang = 5;
    }

    public int att() {
        return 10;
    }

    public int att_A() {
        this.mp = this.mp - 10;
        return 30;
    }

    public int att_B() {
        this.mp = this.mp - 20;
        return 50;
    }

    public void dmg(int input_dmg) {
        this.hp = this.hp - input_dmg;
    }

    public void info() {
        System.out.println("_________"+name+"________");
        System.out.println("HP = "+this.hp);
        System.out.println("HP = "+this.mp);
    }

    //hp < 0 ? 어떻게 되는지 메서드
    
}
