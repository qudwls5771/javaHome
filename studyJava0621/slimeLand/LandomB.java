package slimeLand;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LandomB {
    String name;

    LandomB(String name){
        this.name = name;
    }

    public void info(){
        System.out.println(this.name);
    }


    public static void main(String[] args){
        ArrayList<String> name_D = new ArrayList<>();
        name_D.add("동천 홍");
        name_D.add("돈까스 다");
        name_D.add("달식당");
        name_D.add("맘스터치");
        name_D.add("화성식당");
        name_D.add("김밥나라");
        name_D.add("(한식 / 중식)노란 식당");
        name_D.add("(한식) 마약만두 앤 칼국수");
        name_D.add("(한식) 천안역 국수");
        int index_D = (int)(Math.random() * (name_D.size()-1));
        

   
                LandomB landomB = new LandomB(name_D.get(index_D));
                landomB.info();
                      
        
            
        

      
            
                
        
    }

 
    
}
