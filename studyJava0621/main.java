import slimeLand.*;
import java.util.*;

public class main {

    public static void main(String[] arg) {
        // 슬라임과 대치하는 용사 상황을 코드로 구현
        // 용사를 만들자, 용사 객체 생성(1명)

        // string 메모리를 적게 쓰는 법
        String input = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("용사를 정해주세요");
        // 키보드 입력값을 input 변수에 할당
        input = scan.nextLine();

        Warrior warrior = new Warrior(input, 1000, 5000);


            warrior.info();

      
            String input_name_1 = "노란 슬라임";
            String input_name_2 = "빨간 슬라임";
            String input_name_3 = "초록 슬라임";
            String input_name_4 = "파란 슬라임";
            int input_hp = 30;
            int input_mp = 3;

     
            slime slime_test = new slime();
     /*        slime_test.info();
            slime_test.dmg(slime_test.hit());
            slime_test.info();
            slime_test.die();  */
           




                while(true){

                
                    
                }
            








        
    }

    public static String[] slimes(){
        //슬라임 종류
        Random r = new Random();
        String[] slime_s = {"파란 슬라임", "빨간 슬라임", "노랑 슬라임", "핑크 슬라임", "초록 슬라임", "아이스 슬라임"};
        int[] slime_sava = new int[6];
        for(int i = 0; i <slime_s.length; i++){
            int slime_c = r.nextInt(slime_s.length);
            //중복 제거 if문
            if(slime_sava[slime_c] ==1){
                i--;
                //중복 나오면 다시 돌아가기?
                continue;
            }else {
                //중복 안나오면 나옴
                slime_sava[slime_c] = 1;
            }
        }
        return slime_s;
    }
    
}