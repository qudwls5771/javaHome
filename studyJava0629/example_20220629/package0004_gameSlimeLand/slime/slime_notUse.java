package package0004_gameSlimeLand.slime;

public class slime_notUse {
    //필드값 (슬라임의 hp, mp...)

    public String name;
    public int hp;
    public int mp;
    

    //생성자 (슬라임 클래스를 인스턴스로 만들 때 매개변수를 받아서 객체 만들기)
    public slime_notUse() {
        this.name = "평범한 슬라임";
        this.hp = 10;
        this.mp = 0;
    }
    
    public slime_notUse(String input_name, int input_hp, int input_mp) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
    }

    public void dmg(int dmg) {
        this.hp = this.hp - dmg;
        System.out.println(this.name+"은 "+dmg+" 공격을 받았습니다");
    }

    public int att() {
        System.out.println(this.name+"은 "+10+" 공격을 했습니다!!");
        return 10;
    }

    public void info() {
        System.out.println("__________"+name+"_________");
        System.out.println("HP = "+this.hp);
        System.out.println("MP = "+this.mp);
    }
}
