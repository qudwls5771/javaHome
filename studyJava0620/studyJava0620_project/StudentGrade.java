package studyJava0620_project;

public class StudentGrade {

    //필드 세팅값 
   public String className = "4Class";
   public String name;
   public String subject;
   public int grade;



    public StudentGrade(){

    }

    public StudentGrade(String input_name){
        this.name =input_name;
    }

    
    public StudentGrade(String input_name,String intput_subject, int input_grade){
        this.name =input_name;
        this.subject =intput_subject;
        this.grade =input_grade;

    }

    


    
}
