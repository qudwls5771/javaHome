import pack.*;

public class main {
    public static void main(String args[]){
        //실행1
        PointXY point = new PointXY(100, 100); 

        //실행2
        point.setX(200);

        //실행3
        point.setY(300);

        //실행4
        point.moveXY(50,50);

        System.out.println(getX() + " " + getY()) ;


    }

 

 
    
}
