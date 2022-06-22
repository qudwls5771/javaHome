package ex1;
import java.util.*;

public class ex1 {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] arg) {
        System.out.println("================================");
        System.out.println("당신의 직업 고르시오!");
        System.out.println("================================");
        System.out.println("1. 개발자 | 2. 전사 | 3. 마법사");
        System.out.println("================================");
        System.out.print("직업 선택(번호) : ");
 

        // Scanner sc = new Scanner(System.in);
        String jobselect = sc.next();

        switch(jobselect){
            case "1":
                
                break;
            case "2":
                System.out.println("당신의 직업은 전사입니다");
                break;
            case "3":
                System.out.println("당신의 직업은 마법사입니다");
                break;
            default:
                System.out.println("정보 없음");
                break;
        }
        String enter1 = sc.nextLine();
        System.out.println("엔터를 입력 해주세요");
        String enter = sc.nextLine();
        // == 이 아니라 equal
        if(enter.equals("")){
        System.out.println("당신은 길을 가는 도중 몬스터를 만났습니다");
        //슬라임1 등장
       
        } else {
        System.out.print("enter키를 눌러 게임을 진행해 주세요");}


       
                        
                       

                        // // 슬라임의 공격
                        // programmer.dmg(slimeRed.SlimeAttack());
                        // slimeRed.state();
        
                        // // 용사의 공격
                        // slimeRed.dmg(programmer.BasicAttack());
                        // programmer.state();   
        
        
                        // // 용사의 스킬공격
                        // programmer.SkillAttack();

    }
}