package packg;

import java.util.ArrayList;
import java.util.Scanner;

public class insertCom {
    protected static void insertCom() {
        while(true){
            Scanner sc = new Scanner(System.in);
            ComP comp = new ComP();
            ArrayList<ComP> comList = new ArrayList<ComP>();
            
            System.out.println("Mac을 등록해주세요.");
            comp.setNoteB(sc.nextLine());
            System.out.println("CPU를 입력하세요!");
            comp.setCpu(sc.nextLine());
            System.out.println("RAM를 입력하세요!");
            comp.setram(sc.nextLine());
            System.out.println("SSD를 입력하세요!");
            comp.setssd(sc.nextLine());

            System.out.println("Mac : " + comp.getNoteB());
            System.out.println("CPU : " + comp.getCpu());
            System.out.println("RAM : " + comp.getram());
            System.out.println("SSD : " + comp.getssd());
    
            System.out.println("입력한 내용을 저장? Y, N");
            String save = sc.nextLine();
            //equalsIgnoreCase : 대소문자 구분안함.
            //equals : 대소문자 구분함.
            if(save.equalsIgnoreCase("y")){
                comList.add(comp);
                System.out.println("저장완료!");
                break;
            }else if(save.equalsIgnoreCase("n")){
                System.out.println("초기메뉴로 이동");
                break;
            }
        }
    }
}
