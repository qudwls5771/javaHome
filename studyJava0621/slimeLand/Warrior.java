package slimeLand;

public class Warrior {
    public String name;
    public int hp;
    public int mp;
    //public int hit;

    public Warrior(String input_name, int input_hp, int input_mp){//, int input_hit
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
     /*    this.hit = input_hit; */
    }

    public Warrior() {
    }

    public int att(){
        return 10;
    }

    public int att_A(){
        this.mp = this.mp -10;
        return 30;
    }

    public int att_B(){
        this.mp = this.mp -20;
        return 50;
    }

    public void dmg(int input_dmg){
        this.hp = this.hp - slimes.hit;
        System.out.println(this.name +input_dmg+"공격을 당했습니다.");
    }

    public void info(){
        System.out.println("________" + name + "________");
        System.out.println("HP : "+this.hp);
        System.out.println("MP : "+this.mp);
    }

/*     public int hit() {
        double random = Math.random();
        int intValue = (int) (random * 11) + 0;
        if (intValue > 2) {
            System.out.println("공격에 성공했습니다.");
         } else {
             System.out.println("공격에 실패했습니다.");
         }

        return intValue;
    } */
}

    
