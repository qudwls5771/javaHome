package package0004_gameSlimeLand.inven.potion;

//부모 클래스 생성
public class Potion {
    public int effectHP;
    public String color;

    Potion(int input_effectHP) {
        this.effectHP = input_effectHP;
        this.color = "형용할 수 없는 색깔";
    }

    Potion(int input_effectHP, String input_color) {
        this.effectHP = input_effectHP;
        this.color = input_color;
    }

    public void usePotionText() {
        System.out.println("포션을 사용하였습니다.");
    }
    
}
