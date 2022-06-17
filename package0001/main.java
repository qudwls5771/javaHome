

public class main {
    
    public static void main(String args[]){
        // 인스턴스 생성
        // 스택    , 힙
        Car myCar = new Car();

        // 인스턴스 내용 출력
        System.out.println(" : " + myCar.company);

        // 인스턴스의 내용 출력
        // myCar에서 스피드는 0으로 초기값이 되어 있었지만 main에 speed에 대한 필드 데이터를 부여
        myCar.speed = 60;
        System.out.println("myCar : " + myCar.speed);

        int check = myCar.speedCheck();
        System.out.println("this_speed : "+ check);
        //Carc에 있는 Carchek메소드에 check라는 구현 된 메소드를 가져와서 *2를 해준다.
        System.out.println("Carc: "+ Carc.Carcheck(check));

    }
}
