package package0005_invenItemOverridingExample;

public class WeaponMethod extends WeaponBasic000 {

    @Override
    public void attAction() {
        System.out.println("무기 "+this.name+"을 장착하였습니다");
        System.out.println("무기의 공격범위는 "+this.AttRange+"입니다");
        System.out.println("무기의 교체 시간은 "+this.ChangeTime+"입니다");
    }

    @Override
    public void destruction() {   
        super.destructionBefore(super.defaultName);
        attAction();
    }
    
}
