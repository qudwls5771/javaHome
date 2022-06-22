package slimeLand;

public class birdM extends slime{
    public birdM(String name, int hp, int mp, int hit, int amor){
        super(name, hp, mp, hit, amor);
        this.hp = hp * 20;

    }

    public void dmg(int dmg) {
        int am_dm = this.amor - dmg;
        if(amor > dmg){
            System.out.println(this.name + "은 " + "miss");
        }else if (dmg > amor){
            this.hp = this.hp - Math.abs(am_dm);
            System.out.println(this.name + "은 " + am_dm + "의 공격을 받았습니다.");
        }
    }
    public void info() {
        System.out.println("__________" + name + "__________");
        System.out.println("Name = " + this.name);
        System.out.println("HP = " + this.hp);
        System.out.println("MP = " + this.mp);
        System.out.println("MP = " + this.amor);
    }

    public int hit() {
        double random = Math.random();
        int intValue = (int) (random * 101) + 50;
        if (intValue > 60) {
            System.out.println(intValue + "공격에 성공했습니다.");
        } else {
            System.out.println("공격에 실패했습니다.");
            intValue = 0;
        }

        return intValue;
    }

    
    // 죽을 경우에 드랍
    public void die() {
        if (this.hp <= 0) {
            System.out.println(this.name + "이/가 죽었습니다.");
            this.hp=0;
        } else {
            System.out.println("없음");

        }
    }
    
}
