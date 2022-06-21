package packg;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        
        while (true) {
            System.out.println("(1) Mac등록 \t (2) 전체 조회\t (3) 상세 조회\t (0) 종료");
            String userInput = sc.nextLine();

            switch (userInput) {
                case ("1"):
                    insertCom.insertCom();
                    break;

                case ("2"):
                    selectAll.selectAll();
                    break;
                case ("3"):
                    selectOne.selectOne();
                    break;

                case ("0"):
                    System.out.println("프로그램 종료");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                    break;
            }

        }
    }

  
 
}