package slimeLand;

import java.util.ArrayList;
import java.util.Scanner;

public class slimemain {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg) {
        boolean run = true;
        boolean flag = false;
        boolean run1 = true;

        Magiction01 magiction01 = new Magiction01();
        magiction01.info();
        Warrior01 warrior01 = new Warrior01();
        warrior01.info();
        monster slimeRed = new monster("빨간슬라임", 100, 40);
        monster ghost = new monster("고스트", 50, 40);
        monster beast = new monster("비스트", 100, 40);

        monster[] monsters = { slimeRed, ghost, beast };
        // 캐릭터 선택창

        while (run) {
            System.out.println("-----------------몬스터 잡기-------------------");
            System.out.println("---------------캐릭터 선택(번호)---------------");
            System.out.println("---------1. 전사 | 2. 마법사 | 3. 종료---------");
            System.out.println("-----------------------------------------------");
            System.out.print("선택:");

            int choice = sc.nextInt();
            // 게임종료
            if (choice == 3) {
                while (true) {
                    System.out.println("종료하시겠습니까? [Y/N]");
                    String ESC_ans = sc.next();

                    if (ESC_ans.equals("N") || ESC_ans.equals("n")) {
                        flag = false;
                        break;
                    }
                    if (ESC_ans.equals("Y") || ESC_ans.equals("y")) {
                        flag = true;
                        break;
                    } else if (!(ESC_ans.equals("Y") || ESC_ans.equals("y")
                            || ESC_ans.equals("N") || ESC_ans.equals("n"))) {
                        System.out.println("다시 입력해라 ");
                    }
                }
                if (flag)
                    break;
            }
            // 전투시작(전사)

            if (choice == 1) {
                System.out.println("-----------------전사를 선택하셨습니다-----------------");
                warrior01.info();
                sc.nextLine();
                System.out.println("----------------------몬스터 등장---------------------");
                slimeRed.info();
                ghost.info();
                beast.info();
                sc.nextLine();
                System.out.println("-----------------------------------------------------");
                System.out.println("1. 기본공격 2. 스킬 3. 인벤토리 4. 도망가기");

                int choice1 = sc.nextInt();
                while (run1) {

                    if (choice1 == 1) {
                        while (true) {
                            System.out.println("-------------------!!!WarriorAttack!!!------------------");
                            slimeRed.dmg(warrior01.BasicAttack());
                            slimeRed.info();
                            
                            
                            System.out.println("-------------------!!!MonsterAttack!!!-----------------");
                            warrior01.dmg(slimeRed.att());
                            warrior01.info();
                            break;
/* 
                            if (slimeRed.hp > 0) {

                            } else if (slimeRed.hp < 1) {
                                System.out.println("슬라임 잡기 성공!");
                                break;
                            }
                            if (warrior01.hp > 0) {

                            } else if (warrior01.hp < 0) {
                                System.out.println("GAME OVER");
                                break;
                            }
                            if (ghost.hp < 1) {
                                System.out.println("고스트 잡기 성공!");
                            } else if (ghost.hp > 0) {

                            }

                            else if (choice1 == 2) {

                                slimeRed.info();
                            } */

                        }
                    }

                }

            }
        }
    }

}
