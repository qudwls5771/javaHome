package studyJava0615;

public class 연산자 {
    public static void main(String[] args){
        Number number1 = new Number();
        Number number2 = new Number();



        number1.numStatic++; //클래스 필드 num 1증가
        number1.numNormal++; //인스턴스 num 1증가
        System.out.println("static1 : "+number1.numStatic);
        System.out.println("instance1 : "+number1.numNormal);
        System.out.println("static2 : "+number2.numStatic);
        System.out.println("instance2 : "+number2.numNormal);
        
    }
    
}

class Number{
    static int numStatic = 10;
    int numNormal = 10;
}
