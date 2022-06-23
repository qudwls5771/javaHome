package slimeLand;

import java.util.ArrayList;
import java.util.Scanner;

public class buildMonster {

    public void buildMonster(){

        String input = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("용사를 정해주세요");
        ArrayList<String> name_S = new ArrayList<>();
        name_S.add("노란 슬라임");
        name_S.add("빨간 슬라임");
        name_S.add("파랑 슬라임");
        name_S.add("초록 슬라임");
        name_S.add("검은 슬라임");
        ArrayList<String> name_D = new ArrayList<>();
        name_D.add("노란 개");
        name_D.add("빨간 개");
        name_D.add("파랑 개");
        name_D.add("초록 개");
        name_D.add("검은 개");
        ArrayList<String> name_B = new ArrayList<>();
        name_B.add("노란 새");
        name_B.add("빨간 새");
        name_B.add("파랑 새");
        name_B.add("초록 새");
        name_B.add("검은 새");
        ArrayList<String> name_G = new ArrayList<>();
        name_G.add("노란 고릴라");
        name_G.add("빨간 고릴라");
        name_G.add("파랑 고릴라");
        name_G.add("초록 고릴라");
        name_G.add("검은 고릴라");
        ArrayList<String> name_T = new ArrayList<>();
        name_T.add("노란 호랑이");
        name_T.add("빨간 호랑이");
        name_T.add("파랑 호랑이");
        name_T.add("초록 호랑이");
        name_T.add("검은 호랑이");

        input = scan.nextLine();
        int index_D = (int)(Math.random() * (name_D.size()-1));
        int index_S = (int)(Math.random() * (name_S.size()-1));
        int index_B = (int)(Math.random() * (name_B.size()-1));
        int index_G = (int)(Math.random() * (name_G.size()-1));
        int index_T = (int)(Math.random() * (name_T.size()-1));


        Warrior warrior = new Warrior(input, 1000, 5000);
        warrior.info();
        int count =1;


        
        
        while(true){
            scan.nextLine();
            switch(count){
                
                case 1 :
                slime slimes = new slime(name_S.get(index_S), 10, 0, 10, 0);
                slimes.info();
                slimes.dmg(slimes.hit());
                count++;
                break;
                
                case 2 :
                dogM dogm = new dogM(name_D.get(index_D), 10, 10, 10, 10);
                dogm.info();
                dogm.dmg(dogm.hit());
                count++;
                break;

                case 3 :
                birdM birdm = new birdM(name_B.get(index_B), 20, 0, 20, 25);
                birdm.info();
                birdm.dmg(birdm.hit());
                count++;
                break;
                
                case 4 :
                gorillaM gorillam = new gorillaM(name_G.get(index_G), 30, 0, 30, 30);
                gorillam.info();
                gorillam.dmg(gorillam.hit());
                count++;
                break;

                case 5 :
                tigerM tigerm = new tigerM(name_T.get(index_T), 40, 0, 40, 40);
                tigerm.info();
                tigerm.dmg(tigerm.hit());
                count++;
                break;

            }
        }
    }

}
