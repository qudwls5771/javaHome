package studyJava0626_M;

import java.util.ArrayList;

public class hero {
    String C_name = "warrior";
    int Whp = 10000;
    int Wmp = 10000;


    public void show_Inpo(){
        System.out.println("HP : " + this.Whp);
        System.out.println("MP : " + this.Wmp );
    }

    public void attack(){
        WaeponT waeponT = new WaeponT();


        waeponT.coolTime_S();
        waeponT.coolTime_L();
        waeponT.coolTime_Lan();
    
             
        

    }

    private static void startForIf(){
        for(int i = 0; i< 6; i++){
            for(int j = 0; j<6; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }


    }

    private static void startForIs(){
        for(int i =0; i< 6; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }



    private static void startForIss(){

        for(int i =0; i< 6; i++){
            for(int j = i; j<6; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }


    private static void startForIsss(){
        for(int i = 1; i< 5; i++){
            for(int j =1; j<5-i; j++ ){
                System.out.print(" ");
            }
            for(int k = 0; k< i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 4; i> 0; i--){
            for(int j =1; j<5-i; j++ ){
                System.out.print(" ");
            }
            for(int j = 0; j< i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    private static void startForIff(){
        for(int i = 1; i<5; i++){
            for(int j =1; j<5-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k< i*2-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 4; i> 0; i--){
            for(int j =1; j<5-i; j++ ){
                System.out.print(" ");
            }
            for(int j = 0; j< i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args){
     //   hero Hero = new hero();
     //   Hero.attack();


        startForIf(); //직사각형
        startForIs(); //직각삼각형
        startForIss();  //역삼각형
        startForIsss(); //마름모
        //startForIff(); 
    }

  

 


  
}
