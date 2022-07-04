package studyJava0626_M;

public class Long extends Waepon {
    Long(){
         this.name = "LongSword";
        this.AttRange = 3;
        this.ChangeTime =3;
    
       
    }

    Long(String name, int AttRange, int ChangeTime){
        this.name = "LongSword";
        this.AttRange = 3;
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
       // System.out.println("무기 교체" + super.Dname);
       // super.WaeponB(super.Dname);
        attAction();

    }
    @Override
    public void WaeponB(String name_B){ // 교체하기 전
        this.name = name_B;
    }

    @Override
    public void coolTime_L() {
        Waepons[] productList = new Waepons[3];
        productList[1] = new Waepons("LongSword", 3, 5);
    
        for (int i = 0; i < productList.length; i++) {

            productList[1].hit();
            System.out.println("Long Sword Attack = 5초 후 공격 울립니다.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        

    }


    @Override
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
