package package0004_gameSlimeLand.slime;

public class NormalSlime {
    //우리의 노멀슬라임은 lv1의 갸냘픈 슬라임입니다

    //필드값
    public int hp;
    public int mp;
    public int exp;
    public String name;
    public String color;


    public void initSlime() {
        System.out.println(this.name+" 슬라임이 태어났습니다");
    }

    public String getName() {
        return this.name;
    }

    public int att() {
        return 10;
    }

    public void getAction(actionSlime action) {
        action.playAction();
    }

    
    
}
