package packg;

import java.util.Scanner;

public class selectAll {
    public static void selectAll() {
        while (true) {
            ComP comp = new ComP();
            Scanner sc = new Scanner(System.in);

            System.out.println("컴퓨터 목록" + comList.size());
            for (int i = 0; i < comList.size(); i++) {
                System.out.println("-----------------------");
                System.out.println("Mac : " + comList.get(i).getNoteB);
                System.out.println("CPU : " + comList.get(i).getCpu);
                System.out.println("RAM : " + comList.get(i).getram);
                System.out.println("SSD : " + comList.get(i).getssd);
                System.out.println("-----------------------\n");
            }

            System.out.println("메뉴로 이동! (m) 프로그램 종료(0)");
            String back = sc.nextLine();
            if (back.equalsIgnoreCase("m")) {
                break;
            } else if (back.equals(0)) {
                System.out.println("프로그램 종료!");
            }

        }
    }
}
