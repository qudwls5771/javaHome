public class Main {

    public static void main(String[] args){

        Student Kim = new Student("Kim", 1);
        Student Kim_1 = new Student("Kim", 2);
        Student Lee = new Student("Kim", 3);
        Student Lee_2 = new Student("Kim", 4);


        Kim.equals(Kim_1);


        if (Kim.equals(Kim_1)){
            //같을 때 일치를 출력
        }else{
            //다를 때 불일치를 출력
        }

        System.out.println("Hello world");

    }
}
