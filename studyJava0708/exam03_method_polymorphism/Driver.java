package studyJava0708.exam03_method_polymorphism;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Driver {
    Scanner sc = new Scanner(System.in);
    int exit = 0;

    public void drive(Vehicle vehicle) {
        vehicle.run();
    }

    public void high(highPass highpass) {
        highpass.highPass();
    }

    //인터페이스 = 버스, 택시 객체 선언
    Vehicle run_B = new Bus();
    Vehicle run_T = new Taxi();
    // 인터페이스 = 버스, 택시 객체 선언
    highPass high_B = new Bus();
    highPass high_T = new Taxi();



    public void class_S(){// 고속도로 모드 선택 메소드
        int go = sc.nextInt();
        //형 변환 인터페이스(Vehicle)를 자식(버스) 형변환
        Bus bus = (Bus) run_B;
        //형 변환 인터페이스(highpass)를 자식(버스) 형변환
        Bus h_B = (Bus) high_B;

        switch (go){
            case 1:
                System.out.println("전문가 모드입니다.");
                System.out.println("속도는 100Km");
                System.out.println("1. 고속도로 2. 도로");
                go_bus();
                bus.run();
                times();
                h_B.exit();
                break;
            case 2:
                System.out.println("숙련가 모드입니다.");
                System.out.println("속도는 60Km");
                System.out.println("1. 고속도로 2. 도로");
                go_bus();
                bus.run();
                times();
                h_B.exit();
                break;
            case 3:
                System.out.println("초보자 모드입니다.");
                System.out.println("속도는 30Km");
                System.out.println("1. 고속도로 2. 도로");
                go_bus();
                if(go ==3){
                    System.out.println("초보자는 고속도로에 들어갈 수 없습니다.");
                    break;
                }
                break;
            default:
                System.out.println("다시 입력해주시요.");
                class_S();
                break;
        }
        ;
    }

    public void go_bus(){ //고속도로 진입 메소드
        //형 변환 인터페이스(highpass)를 자식(버스) 형변환
        Bus h_B = (Bus) high_B;
        int go = sc.nextInt();
        switch (go){
            case 1:
                System.out.println("고속도로에 진입합니다.");
                h_B.highPass();
                break;
            case 2:
                System.out.println("도로에 진입합니다.");
                break;
            case 3:
                exit = -1;
                System.out.println("프로그램 종료");
                break;
            default:
                System.out.println("다시 입력해주시요.");
                go_bus();
                break;
        }
    }
   public void times(){
       try{
           for(int i = 0; i<5; i++){
               TimeUnit.SECONDS.sleep(1);
               System.out.println("부릉부릉");
               System.out.println("서울로 이동중");
           }
           System.out.println("서울도착!");
       }catch(Exception e){
           System.out.println(e);

       }

   }

    public void go_taxi(){

        Taxi h_T = (Taxi) high_T;
        int go = sc.nextInt();
        switch (go){
            case 1:
                System.out.println("고속도로에 진입합니다.");
                h_T.highPass();
                break;
            case 2:
                System.out.println("도로에 진입합니다.");
                break;
            case 3:
                exit = -1;
                System.out.println("프로그램 종료");
                break;
            default:
                System.out.println("다시 입력해주시요.");
                go_bus();
                break;
        }
    }

    public void B_T() {
        //형 변환 인터페이스(Vehicle)를 자식(버스) 형변환
        Bus bus = (Bus) run_B;
        Taxi taxi = (Taxi) run_T;
        //형 변환 인터페이스(highpass)를 자식(버스) 형변환
        Bus h_B = (Bus) high_B;
        Taxi h_T = (Taxi) high_T;

        System.out.println("이용하실 교통수단을 선택해주세요. 1.버스 2.택시 3.종료");
        int go = sc.nextInt();
        switch (go) {
            case 1:
                System.out.println("버스를 이용합니다.");
                bus.run();
                System.out.println("모드를 선택해주세요!");
                System.out.println("1. 전문가 2. 숙련자 3. 초보자");
                class_S();
                break;
            case 2:
                System.out.println("택시를 이용합니다.");
                taxi.run();
                System.out.println("모드를 선택해주세요!");
                System.out.println("1. 전문가 2. 숙련자 3. 초보자");
                class_S();
                taxi.run();
                times();
                h_T.exit();
                break;
            case 3:
                exit = -1;
                System.out.println("프로그램 종료");
                break;
            default:
                System.out.println("다시 입력해주시요.");
                B_T();
                break;

        }

    }

}
