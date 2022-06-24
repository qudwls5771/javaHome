package slimeLand;

import java.util.ArrayList;

public class item {
    public int no;
    public String name;
    public int dmgs;
    public String classT;
    
    public item(){

    }

    public item(int no, String name,int dmgs, String classT){
        this.no = no;
        this.name = name;
        this.dmgs = dmgs;
        this.classT = classT;

    }

  
    public void showItemInfo(){
        System.out.println(this.no+" , "+this.name +" , " +  this.dmgs +  ", " + this.classT);
    }

   



    
}
