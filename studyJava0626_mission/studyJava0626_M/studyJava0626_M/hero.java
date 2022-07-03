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
        Monster monster = new Monster();
        Lance lance = new Lance();
        Long Long = new Long();
        shot Shot = new shot();

        Waepons[] productList = new Waepons[3];
        productList[0] = new Waepons();
        productList[0].name = lance.name;
        productList[0].AttRange = lance.AttRange;
        productList[0].ChangeTime = lance.ChangeTime;

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
   

    
             
        

    }

    public static void main(String[] args){
        hero Hero = new hero();
        Hero.attack();
    }

  

 


  
}
