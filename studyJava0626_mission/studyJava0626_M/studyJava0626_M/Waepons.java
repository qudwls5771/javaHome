package studyJava0626_M;

import java.util.Arrays;

public class Waepons extends Waepon{
    public String name;
    public int AttRange;
    public int ChangeTime;

    
    public Waepons(String name, int AttRange, int ChangeTime){
        this.name = name;
        this.AttRange = AttRange;
        this.ChangeTime = ChangeTime;
      
    }
    @Override
    public int hit() {
        double r = Math.random();
                            //(이게 랜덤 공격 * 숫자 = 데미지는 늘려주지 최대, 최소값 바뀜) + 0 (최소값)
        int dmg = (int) (r * 20) + 1;
        if (dmg > 1) {
            System.out.println(dmg + "공격에 성공했습니다.");
        } else {
            System.out.println("공격에 실패했습니다.");
            dmg = 0;
        }
        return dmg;
    }

    public static void main(String[] args){
        Waepons waepons = new Waepons("name", 4, 3);
        System.out.println();
    }
 





    

}
