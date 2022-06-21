import java.util.Scanner;

import slimeLand.*;


public class main {

    public static void main(String[] arg) {
        // 슬라임과 대치하는 용사 상황을 코드로 구현
        // 용사를 만들자, 용사 객체 생성(1명)
        // While문
        // while (true) {
        // 슬라임 몬스터 생성(다수)

            //String 메모리를 적게 쓰는 법
            String input = "";



            Scanner scan = new Scanner(System.in);
            System.out.println("용사를 정해주세요.");
            //키보드 입력값을 input 변수에 할당.
            input = scan.nextLine();

            Warrior warrior = new Warrior(input, 1000, 5000);


        //while문 = 슬라임과 용사가 열심히 반복적으로 싸우는 구역
        while(true){

            //텍스 랜덤으로 입력값 받기(아스키 코드로 랜덤 출력)
            //슬라임 몬스터 생성(다수)
            String input_name_1 = "노란 슬라임";
            String input_name_2 = "빨간 슬라임";
            String input_name_3 = "초록 슬라임";
            String input_name_4 = "파란 슬라임";
            

            int input_hp = 30;
            int input_mp = 3;

            slime slime_A = new slime(input_name_1, input_hp, input_mp);
            slime slime_B = new slime(input_name_2, input_hp, input_mp);
            slime slime_C = new slime(input_name_3, input_hp, input_mp);
            slime slime_D = new slime(input_name_4, input_hp, input_mp);

            
            slime_A.info();
            slime_B.info();
            slime_C.info();
            slime_D.info();


            //슬라임 증식을 한다.



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
}