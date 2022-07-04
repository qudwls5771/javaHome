package studyJava0626_M;

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        //WaeponChange();
        
        //Moster_Emergence();

        fight();
        

    }

    public static void WaeponChange(){
           
        Lance lance = new Lance();
        lance.attAction();

        Long Long = new Long();
        Long.attAction();

        shot Shot = new shot();
        Shot.attAction();
        //Shot.hit();

    }


    public static void Moster_Emergence(){
        int count = 1;
        Monster monster = new Monster();
        while(true){
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
            switch(count){
                case 1 :
                monster.name = "슬라임";
                monster.enemyhp = 9; // 몬스터 체력
                monster.Monster_info();
                count++;
                break;
                case 2 :
                monster.name = "좀 더 강한 슬라임";
                monster.enemyhp = 11;
                monster.Monster_info();
                count++;
                break;
            }

        }
    }

    public static void gameover() {
        hero Hero = new hero();
        System.out.println(Hero.C_name + " Died!");
        System.out.println("GAME OVER!");
        System.exit(0); // terminates if lost
        return;
    }


    public static void fight(){
        hero Hero = new hero();
        
        Scanner sc = new Scanner(System.in);
        String action;
        String spellAction = null;
        boolean fighting = false;
        System.out.println("몬스터 출현");
        Moster_Emergence();
        fighting = true;

        while(fighting = true){
            System.out.println("무기");
            if(Hero.C_name.equals("warrior")){
                System.out.println("용사");

            }
            action = sc.nextLine();

       


            if(action.charAt(0) == 'i'){
                Hero.show_Inpo();
                Monster.Monster_infos();        

            }
        }


    }


}