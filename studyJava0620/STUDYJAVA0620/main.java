package STUDYJAVA0620;

public class main {
    
    public static void main(String args[]){
    //선언 = 할당
     Overloading car1 = new Overloading();
     System.out.println("car1.company" + car1.company);
     System.out.println("car1.model" + car1.model);
     System.out.println();


    Overloading car2 = new Overloading("model_name");
    System.out.println("car2.company" + car2.company);
    System.out.println("car2.model" + car2.model);
    System.out.println();

        
    Overloading car3 = new Overloading("model_name", "black");
    System.out.println("car3.company" + car3.company);
    System.out.println("car3.model" + car3.model);
    System.out.println("car3.color" + car3.color);
    System.out.println();


    Overloading car4 = new Overloading("model_name", "black", 100);
    System.out.println("car4.company" + car4.company);
    System.out.println("car4.model" + car4.model);
    System.out.println("car4.color" + car4.color);
    System.out.println("car4.maxSpeed" + car4.maxSpeed);
    System.out.println();





    }
}
