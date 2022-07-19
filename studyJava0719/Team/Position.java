package Team;

import java.util.ArrayList;
import java.util.Scanner;

public class Position {
    private ArrayList<String> team = new ArrayList<>();
    private String[] Back = new String[2];
    private String[] Front = new String[2];
    private String[] DB = new String[2];
    Scanner sc = new Scanner(System.in);
    private int cnt_T = 0;
    private int cnt_B = 0;
    private int cnt_F = 0;
    private int cnt_D = 0;

    public void team() {
        for (int i = 0; i < 6; i++) {
            System.out.println("이름을 입력하세요.");
            team.add(sc.nextLine());
        }
        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i));
            cnt_T++;
            System.out.println(cnt_T);
        }
    }

    public void back(){
        for(int i = 0; i<Back.length; i++){
            System.out.println("이름을 입력하시오.");
            Back[i] = sc.nextLine();
            cnt_B++;
            System.out.println(cnt_B);
        }
    }
    public void front(){
        for(int i = 0; i<Front.length; i++){
            System.out.println("이름을 입력하시오.");
            Front[i] = sc.nextLine();
            cnt_F++;
            System.out.println(cnt_F);
        }
    }
    public void DB(){
        for(int i = 0; i<DB.length; i++){
            System.out.println("이름을 입력하시오.");
            DB[i] = sc.nextLine();
            cnt_D++;
            System.out.println(cnt_D);
        }
    }

    public void people() throws ArrayIndexOutOfBoundsException {
        if(cnt_T > 6){
            throw new ArrayIndexOutOfBoundsException("총 인원은 6명입니다.");
        }else if(cnt_B > 2){
            throw new ArrayIndexOutOfBoundsException("총 인원은 2명입니다.");
        }else if(cnt_F > 2){
            throw new ArrayIndexOutOfBoundsException("총 인원은 2명입니다.");
        } else if (cnt_D > 2) {
            throw new ArrayIndexOutOfBoundsException("총 인원은 2명입니다.");
        }
    }

    public static void main(String[] args){
        Position position = new Position();
        position.team();
    }


}
