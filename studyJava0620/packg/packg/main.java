package packg;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComP comp = new ComP();
        
        while (true) {
            System.out.println("(1) Mac등록 \t (2) 전체 조회\t (3) 상세 조회\t (0) 종료");
            String userInput = sc.nextLine();

            switch (userInput) {
                case ("1"):
                    insertCom();
                    break;

                case ("2"):
                    selectAll();
                    break;
                case ("3"):
                    selectOne();
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

    private static void insertCom() {
        while(true){
            Scanner sc = new Scanner(System.in);
            ComP comp = new ComP();
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
                comp.comList.add(comp);
                System.out.println("저장완료!");
                break;
            }else if(save.equalsIgnoreCase("n")){
                System.out.println("초기메뉴로 이동");
                break;
            }
        }
    }

    private static void selectAll() {
        while(true){
            ComP comp = new ComP();
            Scanner sc = new Scanner(System.in);
            
            
            System.out.println("컴퓨터 목록" + comp.comList.size());
            for(int i =0; i<comp.comList.size(); i++){
                System.out.println("-----------------------");
                System.out.println("Mac : " + comp.comList.get(i).getNoteB());
                System.out.println("CPU : " + comp.comList.get(i).getCpu());
                System.out.println("RAM : " + comp.comList.get(i).getram());
                System.out.println("SSD : " + comp.comList.get(i).getssd());
                System.out.println("-----------------------\n");
            }
    
            System.out.println("메뉴로 이동! (m) 프로그램 종료(0)");
            String back = sc.nextLine();
            if(back.equalsIgnoreCase("m")){
                break;
            }else if(back.equals(0)){
                System.out.println("프로그램 종료!");
            }
    
        }
    }

    private static void selectOne() {
        ComP comp = new ComP();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("검색할 Mac의 이름을 입력해주세요!");
            String name = sc.nextLine();
            int count = 0;
            for (int i = 0; i < comp.comList.size(); i++) {
                if (name.equals(comp.comList.get(i).getNoteB())) {
                    System.out.println("-----------------------");
                    System.out.println("Mac : " + comp.comList.get(i).getNoteB());
                    System.out.println("CPU : " + comp.comList.get(i).getCpu());
                    System.out.println("RAM : " + comp.comList.get(i).getram());
                    System.out.println("SSD : " + comp.comList.get(i).getssd());
                    System.out.println("-----------------------\n");
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("해당 Mac은 존재하지 않습니다.");
            }else{
                break;
            }
        }
    }

 
}