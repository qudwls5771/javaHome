

public class main {
    
    public static void main(String args[]){
        //인스턴스 생성
        Car myCar = new Car();


        //인스턴스 내용 출력
        System.out.println(" : " + myCar.company);


        //인스턴스의 내용 출력
        System.out.println("myCar : " + myCar.speed);


        int check = myCar.speedCheck();
        System.out.println("this_speed : "+ check);
        System.out.println("CarkCheck : "+ Carc.Carcheck(check));

    }
}
