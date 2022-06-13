package studyJava0613;
import java.util.Scanner; //import는 객체를 불러옴


public class ScannerEX {
    
    public static void main(String[] args){
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
        //new = 새롭게 만들고, 구조를 만든다. , system.in =인자값(객체,통로)
        Scanner scanner = new Scanner(System.in); 

        String name = scanner.next();
        System.out.println("이름은"+name+",");

        String city = scanner.next();
        System.out.println("도시"+city+",");

        int age = scanner.nextInt();
        System.out.println(age+"살,");

        double weight = scanner.nextDouble();
        System.out.println("체중"+weight+"Kg,");

        boolean isSingle = scanner.nextBoolean();
        System.out.println("독신여부"+isSingle+"입니다.");


    }
    
}
