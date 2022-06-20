package studyJava0620_project;
import java.util.Scanner;



public class main {
    
    public static void main(String args[]){

        //데이터를 받아오는 방식  : api(네트워크), excel파일 읽어오기(파일 로딩), cli(terminal에서 데이터 받아오기, Scanner)
        
        //김준석 선생님은 컴퓨터를 사고 싶다.
        //프로그래밍으로 사고 싶은 컴퓨터의 성능지표를 출력하는 시스템을 개발하고 싶다.
        //데이터를 받아오고, 그 데이터를 통해 컴퓨터의 성능을 출력하는 시스템 개발
        //컴퓨터 이름(맥북pro 2021)
        //cpu 성능
        //Ram
        //SSD(하드디스크)
        //단, 데이터가 없는 필드값에 대해 오버로딩으로 처리하세요.
        //Scanner로 데이터를 받아옵니다.


        //Scanner 인스턴스 생성
        Scanner input = new Scanner(System.in);
        System.out.println("Studernt Name!!");
        String inputStudentName  = input.nextLine(); //String으로 받아온다.

        System.out.println("subject Name!!");  
        String inputSubjectName  = input.nextLine(); //String으로 받아온다.

        System.out.println("Grade Name!!");  
        int inputGradePoint  = input.nextInt(); //int로 받아온다.

        System.out.println("student" + inputStudentName + "subject" + inputSubjectName 
        + "grade" + inputGradePoint);

        
        //input 데이터 무결성 체크(데이터가 잘 왔는지 확인)



        //인자값을 통해 인스턴스 생성자 생성
        StudentGrade student = new StudentGrade();
        StudentGrade student_1 = new StudentGrade(inputStudentName);
        StudentGrade student_2 = new StudentGrade(inputStudentName, inputSubjectName, inputGradePoint);
        
/*         System.out.println("----------------");
        System.out.println(student_1.className);
        System.out.println(student_1.name);
        System.out.println("----------------"); */


        System.out.println(student.className);
        System.out.println("----------------");
        System.out.println(student_2.className);
        System.out.println(student_2.name);
        System.out.println(student_2.subject);
        System.out.println(student_2.grade);
        System.out.println("----------------");







 


    }
}
