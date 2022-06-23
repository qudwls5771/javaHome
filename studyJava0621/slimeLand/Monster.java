package slimeLand;

import java.util.*;

public class Monster {
    
    

    public String name;
    public int hp;
    public int mp;
    public int hit;
    public int amor;

        

    
    public Monster() {
        this.name = "평범한 괴물";
        this.hp = 10;
        this.mp = 0;
        this.hit = 0;
        this.amor = 0;

    }
    
    public Monster(String name){
        this.name = name;

    }

    public Monster(String name, int hp, int mp, int hit, int amor) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.hit = hit;
        this.amor = amor;

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
        int intValue = (int) (random * 11) + 0;
        if (intValue > 2) {
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



   //for -> if -> switch
   //몬스터도 인벤토리 같은 걸 만들어서 그 안에 아이템이 들어있는데 그 중에 랜덤값으로 드랍하게 한다.
   //1. 일반 공격 2. 스킬  3. 포션 빨기 4. 도망가기
    
    
    
}