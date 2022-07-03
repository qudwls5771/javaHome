package package0004_gameSlimeLand.slime;

//extends를 통해 NormalSlime의 데이터를 물려받았습니다 (상속)
public class RedSlime extends NormalSlime {

    public RedSlime(int input_hp, int input_mp, String input_color, String input_name) {
        this.hp = input_hp;
        this.mp = input_mp;
        this.name = input_name;
        this.color = input_color;
    }

    public void getColor() {
        System.out.println("이 슬라임의 색상은 "+this.color+" 입니다");
        System.out.println("이 슬라임의 이름은 "+this.name+" 입니다");
        System.out.println("이 슬라임의 HP는 "+this.hp+" 입니다");
        System.out.println("이 슬라임의 MP는 "+this.mp+" 입니다");
    }

    @Override
    public int att() {
        int rand = (int)Math.random();
        if(rand==1) {
            return criticalAtt();
        }else {
            return normalAtt();
        }
        
    }

    public int criticalAtt() {
        return hp/2;
    }

    public int normalAtt() {
        return mp/3;
    }
    
}
