package packg;

import java.util.ArrayList;
import java.util.Scanner;

public class insertCom {
    private static void insertCom() {
        while(true){
            ArrayList <ComP> list = new ArrayList<ComP>();
            Scanner sc = new Scanner(System.in);

            
            System.out.println("Mac을 등록해주세요.")   ;
            String noteB = sc.nextLine();
            System.out.println("CPU를 입력하세요!");
            String cpu = sc.nextLine();
            System.out.println("RAM를 입력하세요!");
            String ram = sc.nextLine();
            System.out.println("SSD를 입력하세요!");
            String ssd = sc.nextLine();
            ComP comp = new ComP(noteB, cpu, ram, ssd);
           
            System.out.println("입력한 내용을 저장? Y, N");
            String save = sc.nextLine();
            //equalsIgnoreCase : 대소문자 구분안함.
            //equals : 대소문자 구분함.
            if(save.equalsIgnoreCase("y")){
                list.add(comp);
                System.out.println("Mac "+noteB + " CPU " +cpu + " RAM " + ram + " SSD " +ssd);
                System.out.println("저장완료!");
                break;
            }else if(save.equalsIgnoreCase("n")){
                System.out.println("초기메뉴로 이동");
                break;
            }
        }
    }
}
