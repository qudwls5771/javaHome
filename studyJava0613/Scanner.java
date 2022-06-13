package studyJava0613;
import java.util.Scanner;


class Main {
    
    public static void main(String[] args){
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("이름은"+name+",");

        String city = scanner.next();
        System.out.println("이름은"+city+",");

        int age = scanner.nextInt();
        System.out.println("이름은"+age+"살,");

        double weight = scanner.nextDouble();
        System.out.println("이름은"+weight+"Kg,");

        boolean isSingle = scanner.nextBoolean();
        System.out.println("독신여부"+isSingle+"입니다.");


    }
    
}
