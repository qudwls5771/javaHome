package studyJava0626_M;

import java.util.Scanner;

public class Monster {
    static String name;
    static int enemyhp;
    

   
    

    public static void Monster_info() {
        System.out.println("Enemy " + "\nname: " + name + "\nhp: " + enemyhp + "\ndmg: " + M_hit() + "\n");
    }

    public static void Monster_infos() {
        System.out.println("Enemy " + "\nname: " + name + "\nhp: " + enemyhp + "\ndmg: ");
    }



    public static int M_hit() {

        hero Hero = new hero();
        
        double r = Math.random();
                            //(이게 랜덤 공격 * 숫자 = 데미지는 늘려주지 최대, 최소값 바뀜) + 0 (최소값)
        int dmg = (int) (r * 20) + 1;
        if (dmg > 1) {
            Hero.Whp = Hero.Whp - dmg;    
        } else {
            System.out.println("공격에 실패했습니다.");
            dmg = 0;
        }
        return dmg;
    }

    public void dmg(int dmg){
        int wa_mh = this.enemyhp;
    }

    
}
