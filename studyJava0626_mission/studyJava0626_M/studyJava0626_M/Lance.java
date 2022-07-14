package studyJava0626_M;

public class Lance extends Waepon{

    Lance(){//매개 변수 없는 생성자 - 인스턴스를 만들면 자동으로 할당
        this.name = "Lance";
        this.AttRange = 5;
        this.ChangeTime =10;
      
    }

    Lance(String name, int AttRange, int ChangeTime){
        this.name = "Lance";
        this.AttRange = 5;
        this.ChangeTime =10;
    }


    @Override
    public void attAction(){
        System.out.println("무기 : " + this.name + " 를 장착");
        System.out.println("무기의 범위는 : " + this.AttRange + "입니다.");
        System.out.println("무기의 교체시간은 : " + this.ChangeTime + "초 입니다.");
    
    }

    @Override
    public void WaeponC(){
        //System.out.println("무기 교체" + super.Dname);
        //super.WaeponB(super.Dname);
        attAction();

    }

    @Override
    public void WaeponB(String name_B){ // 교체하기 전
        this.name = name_B;
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

    @Override
    public void coolTime_Lan() {
        Waepons[] productList = new Waepons[3];
        productList[0] = new Waepons("Lance", 5, 10);

        for (int i = 0; i < productList.length; i++) {

            productList[0].hit();
            System.out.println("Lance Attack = 10초 후 공격 울립니다.");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        

    }

    public static void main(String[] args){
        Lance lance = new Lance();
        shot shots = new shot();
        
        shots.coolTime_S();
        lance.coolTime_Lan();
    }


    

    
}

