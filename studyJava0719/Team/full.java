package Team;

import java.util.Scanner;

public class full {
    public static void main(String[] args) {
        Position Kim = new Position("김", "Back", "team");
        Position You = new Position("유", "Back", "team");
        Position Lee = new Position("이", "Front", "team");
        Position Choi = new Position("최", "Front", "team");
        Position Park = new Position("박", "DB", "team");
        Position Lim = new Position("임", "PM", "team");

        Position mesi = new Position("강", "Back", "team");
        Position[] positions = new Position[7];

        Scanner  sc = new Scanner(System.in);

        positions[0] = Kim;
        positions[1] = You;
        positions[2] = Lee;
        positions[3] = Choi;
        positions[4] = Park;
        positions[5] = Lim;
        positions[6] = mesi;

        try{
            System.out.println("----------포지션----------");
            mesi.team(positions);
            mesi.Go(mesi.cnt_D, mesi.cnt_B, mesi.cnt_F, mesi.cnt_M);
            System.out.println("----------총인원----------");
            mesi.people(positions);
            mesi.peoples(mesi.cnt_T);
        }catch (ArrayIndexOutOfBoundsException e){
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
        }catch (TeamArrayIndexOutOfBoundsException e){
            String message = e.getMessage();
            System.out.println(message);
            System.out.println();
        }catch(Exception e) {
            System.out.println("내가 예상하지 못한 오류");

        }
    }
}
