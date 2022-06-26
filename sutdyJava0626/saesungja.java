public class saesungja {
    public static void main(String[] args)    {
        //객체 생성 및 초기화
        Bicycle b1 = new Bicycle("부릉", 21.74, 819000);

        System.out.printf("Bicycle {%s, %.2fkg, %d원}\n" , b1.name, b1.weight, b1.price);

        Bicycle b2 = new Bicycle("간다", 20.01, 880000);

        System.out.printf("Bicycle {%s, %.2fkg, %d원}\n" , b2.name, b2.weight, b2.price);

    }
}

    class Bicycle{ // 실제 객체를 만들기위한 설계도
        //필드
        String name ;
        double weight;
        int price;

        //생성자 - 파라미터를 초기화
        Bicycle(String n, double w, int p){
            name = n;
            weight = w;
            price = p;
        }

    }
