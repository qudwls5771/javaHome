package Team;

import java.util.Scanner;

public class full {
    public static void main(String[] args) {
            Position position = new Position();

            position.team();
            position.back();
        try{
            position.people();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인원을 초과합니다.");
        }catch (Exception e){
            System.out.println("무슨 오류?");
        }

    }
}
