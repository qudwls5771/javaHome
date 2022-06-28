package studyJava0626_M;

public class shot extends Waepon{
    shot(){
        this.name = "ShotSword";
        this.AttRange = 2;
        this.ChangeTime =3;
      
      
    }

    shot(String name, int AttRange, int ChangeTime){
        this.name = "ShotSword";
        this.AttRange = 2;
        this.ChangeTime =3;
    }



    @Override
    public void attAction(){
        System.out.println("무기 :" + this.name + "을 장착");
        System.out.println("무기의 범위는 : " + this.AttRange + "입니다.");
        System.out.println("무기의 교체시간은 : " + this.ChangeTime + "초 입니다.");
    
    }

    @Override
    public void WaeponC(){
        System.out.println("무기 교체" + super.Dname);
        super.WaeponB(super.Dname);
        attAction();

    }
    @Override
    public void WaeponB(String name_B){ // 교체하기 전
        this.name = name_B;
    }
    
    public int hit() {
        double r = Math.random();
        int dmg = (int) (r * 20) + 1;
        if (dmg > 1) {
            System.out.println(dmg + "공격에 성공했습니다.");
        } else {
            System.out.println("공격에 실패했습니다.");
            dmg = 0;
        }
        return dmg;
    }



   
    
    
}
