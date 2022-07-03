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

<<<<<<< HEAD:studyJava0626_mission/studyJava0626_M/studyJava0626_M/hero.java
        productList[1] = new Waepons();
        productList[1].name = Long.name;
        productList[1].AttRange = Long.AttRange;
        productList[1].ChangeTime = Long.ChangeTime;

        productList[2] = new Waepons();
        productList[2].name = Shot.name;
        productList[2].AttRange = Shot.AttRange;
        productList[2].ChangeTime = Shot.ChangeTime;

        for(int i =0; i<productList.length; i++){
            if(productList[0].hit() > 2){
               System.out.println("공격");
               monster.enemyhp -= lance.hit();
               if(monster.enemyhp <=0){
                   System.out.println("승리");
                   
               }
           }
           if(productList[1].hit() > 2){
            System.out.println("공격");
           }monster.enemyhp -= lance.hit();
           if(monster.enemyhp <=0){
               System.out.println("승리");
               
           }
           if(productList[2].hit() > 2){
            System.out.println("공격");
           }monster.enemyhp -= lance.hit();
           if(monster.enemyhp <=0){
               System.out.println("승리");
               
           }
            
        }
   

    
             
=======
    public void getAction(Waepon waepon){
        waepon.WaeponC();
        waepon.coolTime_L();
        waepon.coolTime_S();
        waepon.coolTime_Lan();
>>>>>>> 673744d0c5b9e52a7b03262529419b08ba5c3303:studyJava0626_mission/studyJava0626_M/hero.java
        
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
