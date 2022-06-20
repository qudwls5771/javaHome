package STUDYJAVA0620;
import java.util.Scanner;

public class main {
    
    public static void main(String args[]){






        //Scanner 인스턴스 생성
        Scanner input = new Scanner(System.in);
        System.out.println("Studernt Name!! \n");
        String inputStudentName  = input.nextLine(); //String으로 받아온다.

        System.out.println("subject Name!! \n");  
        String inputSubjectName  = input.nextLine(); //String으로 받아온다.

        System.out.println("Grade Name!! \n");  
        int inputGradeName  = input.nextInt(); //int로 받아온다.

        System.out.println("student" + inputStudentName + "subject" + inputSubjectName 
        + "grade" + inputGradeName);







    //선언 = 할당
 /*     Overloading car1 = new Overloading();
     System.out.println("car1.company : " + car1.company + "\n");


    Overloading car2 = new Overloading("그랜저");
    System.out.println("car2.company : " + car2.company);
    System.out.println("car2.model : " + car2.model + "\n");

        
    Overloading car3 = new Overloading("그랜저", "black");
    System.out.println("car3.company : " + car3.company);
    System.out.println("car3.model : " + car3.model);
    System.out.println("car3.color : " + car3.color + "\n");


    Overloading car4 = new Overloading("그랜저", "black", 100);
    System.out.println("car4.company : " + car4.company);
    System.out.println("car4.model : " + car4.model);
    System.out.println("car4.color : " + car4.color);
    System.out.println("car4.maxSpeed : " + car4.maxSpeed + "\n"); */





    }
}
