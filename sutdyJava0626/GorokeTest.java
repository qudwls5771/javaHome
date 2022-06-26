public class GorokeTest {
    public static void main(String[] args) {
        //1. Top3고로케를 객체로 만드세요.
        Goroke top1 = new Goroke("피자 고로케", 2500);
        Goroke top2 = new Goroke("치즈 고로케", 2000);
        Goroke top3 = new Goroke("야채 고로케", 1700);


        //2. 고로케 정보를 출력하세요.
        System.out.println(top1.str());
        System.out.println(top2.str());
        System.out.println(top3.str());
        
    }
    
}

class Goroke{
    String name;
    int price;

    Goroke(String n, int p){
        name= n;
        price = p;
    }

    String str(){/// String.format()메소드 : 형식 문자열을 만들어주는 메소드(printf메소드와 흡사)다만 출력하지 않고, 문자열만을 만든다.
        return String.format("Goroke {name : %s, price : %d원}", name, price);
    }

}
