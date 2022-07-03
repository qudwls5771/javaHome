package package0004_gameSlimeLand.inven.potion;

public class RedPotion extends Potion{
    //포션의 효과 증폭 수치
    public int effect;
   

    //포션을 생성할 때 효과 수치를 받음
    public RedPotion(int input_hp, int input_effect, String input_color) {
        super(input_hp, input_color);
        this.effect = input_effect;
    }

    public RedPotion(int input_hp, int input_effect) {
        super(input_hp);
        this.effect = input_effect;
    }

    public int useItem(int invenUseNumber) {
        int result = effectHP * effect;
        System.out.println(super.color+"포션을 사용했습니다");
        return result;
    }
    
}
