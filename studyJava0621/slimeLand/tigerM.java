package slimeLand;

public class tigerM extends Monster{
    public tigerM(String name, int hp, int mp, int hit, int amor){
        super(name, hp, mp, hit, amor);
        this.hp = hp *40;
 
    }

    public tigerM(String name){
        this.name = name;
    }

    
    public int hit() {
        double random = Math.random();
                            //(이게 랜덤 공격 * 숫자 = 데미지는 늘려주지 최대, 최소값 바뀜) + 0 (최소값)
        int intValue = (int) (random * 301) + 100;
        if (intValue > 130) {
            System.out.println(intValue + "공격에 성공했습니다.");
        } else {
            System.out.println("공격에 실패했습니다.");
            intValue = 0;
        }

        return intValue;
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
        System.out.println("amor = " + this.amor);
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
