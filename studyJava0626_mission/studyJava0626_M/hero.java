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



    public static void main(String[] args){
     //   hero Hero = new hero();
     //   Hero.attack();


    }

  

 


  
}
