import java.util.Scanner;

public class Driver {
    Scanner sc = new Scanner(System.in);
    int go = sc.nextInt();
    int exit = 0;

    Bus bus = new Bus();
    Taxi taxi = new Taxi();

    //버스, 택시의 메소드를 Car 덮는다.
    Car car_B = new Bus();
    Car car_T = new Taxi();



    public void Tiers(Car c){
        if(c instanceof Bus){
            Bus b = (Bus) c;
            b.Tier();
        } else if (c instanceof  Taxi) {
            Taxi t = (Taxi) c;
            t.Tier();
        }
    }

    public void B_T(){

        switch (go){
            case 1 :
            case 2 :
            case 3 : // 사용하지 않고 시스템 종료!
                exit = -1;
                System.out.println("프로그램 종료");
                break;
            default : // 잘못 입력했을 경우!
                System.out.println("다시 입력해주세요.");
                B_T();
                break;

        }
    }

}
