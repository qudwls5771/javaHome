import slimeLand.*;

public class main {

    public static void main(String[] arg) {
        // 슬라임과 대치하는 용사 상황을 코드로 구현
        // 용사를 만들자, 용사 객체 생성(1명)
        // While문
        // while (true) {
            // 슬라임 몬스터 생성(다수)
            String input_name = "노란 슬라임";
            int input_hp = 30;
            int input_mp = 3;

            slime slime_A = new slime(input_name, input_hp, input_mp);

            slime slime_B = new slime();

            System.out.println("slime_A: " + slime_A);
            System.out.println("slime_A: " + slime_A.hp);
            System.out.println("slime_A: " + slime_A.mp);
            System.out.println("slime_A: " + slime_A.name);

            System.out.println("slime_B: " + slime_B);
            System.out.println("slime_B: " + slime_B.name);
            System.out.println("slime_B: " + slime_B.hp);
            System.out.println("slime_B: " + slime_B.mp);

            // 슬라임의 공격(1턴)
            slime_B.dmg(5);

            System.out.println("공격받은 slime_B: " + slime_B.name);
            System.out.println("공격받은 slime_B: " + slime_B.hp);
            System.out.println("공격받은 slime_B: " + slime_B.mp);
            
            // 용사의 공격(1턴)
            slime_A.dmg(slime_B.att());
            System.out.println("공격받은 slime_A: " + slime_A.hp);

            // 용사가 죽을 경우

            // 슬라임은 증식을 한다
            // 용사는 슬라임을 공격하여, 슬라임은 죽는다.
            // if(모든 슬라임이 죽을 경우) break;
        // }

        // 용사 객체 생성(1명)

    }
}