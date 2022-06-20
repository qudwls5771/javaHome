package packg;

import java.util.Scanner;

public class selectOne {
    public void selectAll() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("검색할 Mac의 이름을 입력해주세요!");
            String name = sc.nextLine();
            int count = 0;
            for (int i = 0; i < comList.size(); i++) {
                if (name.equals(comList.get(i).getNoteB())) {
                    System.out.println("-----------------------");
                    System.out.println("Mac : " + comList.get(i).getNoteB);
                    System.out.println("CPU : " + comList.get(i).getCpu);
                    System.out.println("RAM : " + comList.get(i).getram);
                    System.out.println("SSD : " + comList.get(i).getssd);
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
