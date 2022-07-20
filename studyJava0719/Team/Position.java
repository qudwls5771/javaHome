package Team;

import java.util.ArrayList;
import java.util.Scanner;

public class Position {
    String name; // 이름
    String positions; //역할
    String team; // 팀

    //count를 센다.
    int cnt_T; //팀
    int cnt_D; //디비
    int cnt_F; //프론트
    int cnt_B; //백
    int cnt_M; //PM
    


    public Position(String name, String positions, String team){
        this.name = name;
        this.positions = positions;
        this.team = team;
    }

    public void team(Position[] position){
        for(int i = 0; i<position.length; i++){
            if(position[i].positions.equals("PM")){
                cnt_M++;
            }else if(position[i].positions.equals("DB")){
                cnt_D++;
            } else if (position[i].positions.equals("Front")) {
                cnt_F++;
            } else if (position[i].positions.equals("Back")) {
                cnt_B++;
            }
        }
    }

    public void people(Position[] position){
        for(int i =0; i<position.length; i++){
            if(position[i].team.equals("team")){
                cnt_T++;
            }

        }

    }

    public void Go(int cnt_D, int cnt_B, int cnt_F, int cnt_M) throws ArrayIndexOutOfBoundsException{
        if(cnt_M > 1){
            System.out.println(this.positions + " 자리가 없습니다.");
        } else if (cnt_B > 2) {
            System.out.println(this.positions + " 자리가 없습니다.");
        } else if (cnt_D > 1) {
            System.out.println(this.positions + " 자리가 없습니다.");
        } else if (cnt_F > 2) {
            System.out.println(this.positions + " 자리가 없습니다.");
        }
    }

    public void peoples(int cnt_T) throws TeamArrayIndexOutOfBoundsException{
        if(cnt_T > 6){
            System.out.println(this.team + " 인원초과!");
        }

    }












}
