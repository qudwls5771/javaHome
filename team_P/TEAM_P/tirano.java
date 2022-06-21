package TEAM_P;

import java.util.Random;

public class tirano{

    public String name;
    public int hp;
    public int mp;
    public int hit;
    Random r = new Random();


    public tirano(){
        this.name = "티라노";
        this.hp = 0;
        this.mp = 0;
        this.hit = 0;
    }

    

    public tirano(String input_name, int input_hp, int input_mp, int input_hit){
        this.name = input_name;
        this.hp = input_hp;
        this.mp = input_mp;
        this.hit = input_hit;

    }

    public void dmg(int dmg){
        this.hp = this.hp - dmg;
        System.out.println(this.name + "은" + dmg + "의 공격을 받았다.");

    }


    public void info(){
        System.out.println("________" + name + "________");
        System.out.println("HP : "+this.hp);
        System.out.println("MP : "+this.mp);
    }

    public int hit(){
        double random = Math.random();
        int intValue = (int) (random *11) +0;
        if(intValue>2){
            System.out.println(intValue + "공격에 성공했습니다.");
        }
            System.out.println("공격에 실패했습니다.");
        return intValue;
    }
    
}