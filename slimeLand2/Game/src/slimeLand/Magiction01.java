package slimeLand;

public class Magiction01 {
    public String name = "마법사";
    public int hp = 200;
    public int mp = 150;

    public void info(){
        System.out.println("------------------" + name + "-------------------");
        System.out.println("직업 =" + this.name);
        System.out.println("HP = "+ this.hp);
        System.out.println("MP = "+ this.mp);
        System.out.println("-----------------------------------------------");
    }
    public void dmg(int input_dmg){
        this.hp = this.hp - input_dmg;
        System.out.println(this.name + "은 " + input_dmg + " 공격을 받았습니다");
    }

    public int BasicAttack() {
        System.out.println(this.name + " 은 " +10+ " 공격을 했습니다!");
        return 10;
    }

    public void icevolt(){
    double RandomAttack = Math.random();
    int SkillAttack = (int)(RandomAttack * 60) + 30;
    System.out.println(this.name +"은 스킬을 사용해 " + SkillAttack + " 공격 했습니다!");
    }


    }

