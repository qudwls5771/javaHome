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

    }

    public void getAction(Waepon waepon){
        waepon.WaeponC();
        waepon.coolTime_L();
        waepon.coolTime_S();
        waepon.coolTime_Lan();
        
    }

    public static void main(String[] args){
        
        hero Hero = new hero();
        Lance lance = new Lance();
        Long longs = new Long();
        shot Shot = new shot();
     //   Hero.attack();

        Hero.getAction(lance);
       // Hero.getAction(longs);
       // Hero.getAction(Shot);

    
    }


  

 


  
}
