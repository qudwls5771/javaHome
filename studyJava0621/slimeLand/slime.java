package slimeLand;

import java.util.*;

public class slime {
    // 필드값 (슬라임의 hp, mp...)

    public String name;
    public int hp;
    public int mp;
    public int hit;

    // 생성자 (슬라임 클래스를 인스턴스로 만들 때 매개변수를 받아서 객체 만들기)
    public slime() {
        this.name = "평범한 슬라임";
        this.hp = 10;
        this.mp = 0;
        this.hit = 0;

    }

    public slime(String input_name, int input_hp, int input_mp, int input_hit) {
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
        this.hit = input_hit;

    }

    public void dmg(int dmg) {
        this.hp = this.hp - dmg;
        if (dmg > 0) {
            System.out.println(this.name + "은 " + dmg + "의 공격을 받았습니다.");
        } else {

        }

    }

    public void info() {
        System.out.println("__________" + name + "__________");
        System.out.println("Name = " + this.name);
        System.out.println("HP = " + this.hp);
        System.out.println("MP = " + this.mp);
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
        } else {
            System.out.println("없음");

        }
    }

    public boolean isLives(){
        if(hp <=0){
            return false;
        }else{
            return true;
        }


    }

   
   //몬스터도 인벤토리 같은 걸 만들어서 그 안에 아이템이 들어있는데 그 중에 랜덤값으로 드랍하게 한다.
   //1. 일반 공격 2. 스킬  3. 포션 빨기 4. 도망가기


    
}