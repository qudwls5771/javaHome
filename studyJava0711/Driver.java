import java.util.Scanner;
import java.util.concurrent.TimeUnit;


//절차지향임 -> 객체지향으로 바꿔야댐
public class Driver {
    Scanner sc = new Scanner(System.in);
        int exit = 0;


    //하이패스 나간다.
    public void hipass_Exit(hiPass p) {
        if (p instanceof Bus) {
            Bus bus = (Bus) p;
            bus.exit();
        } else if (p instanceof Taxi) {
            Taxi taxi = (Taxi) p;
            taxi.exit();
        }
    }

    //하이패스 들어옴
    public void hipass_In(hiPass p) {
        if (p instanceof Bus) {
            Bus bus = (Bus) p;
            bus.hiPass_M();
        } else if (p instanceof Taxi) {
            Taxi taxi = (Taxi) p;
            taxi.hiPass_M();
        }
    }

    //전문가, 숙련자, 초보자 모드 
    public void Tiers(Car c) {
        if (c instanceof Expert) {
            Expert expert = (Expert) c;
            expert.Tier();
        } else if (c instanceof Pro) {
            Pro pro = (Pro) c;
            pro.Tier();
        } else if (c instanceof Novice) {
            Novice novice = (Novice) c;
            novice.Tier();
        }
    }

    //이동하는 시간 (재미로 만듬)
    public void times() {
        try {
            for (int i = 0; i < 5; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("부릉부릉");
                System.out.println("서울로 이동중");
            }
            System.out.println("서울도착!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    hiPass bus = new Bus();
    hiPass taxi = new Taxi();
    Road road = new Road();
    expressway expressways = new expressway();
    public void Roads(){

        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                expressways.Road_go();
                break;
            case 2 :
                road.Road_go();
            case 3: // 사용하지 않고 시스템 종료!
                exit = -1;
                System.out.println("프로그램 종료");
                break;
            default: // 잘못 입력했을 경우!
                System.out.println("다시 입력해주세요.");
                Roads();
                break;
        }

    }
    Car tier_E = new Expert();
    Car tier_P = new Pro();
    Car tier_N = new Novice();

    hiPass hi_B = new Bus();
    hiPass hi_T = new Taxi();

    public void Mod(){
        int choice = sc.nextInt();
        switch (choice){
            case 1 :
                if(choice == 1){
                    Tiers(tier_E);
                    System.out.println("1. 고속도로 2. 도로");
                    Roads();
                    times();
                    hipass_Exit(hi_B);
                    System.out.println("도시진입 초보자 모드로 전환합니다.");
                    Tiers(tier_N);
                }else if(choice ==2){
                    Tiers(tier_E);
                    System.out.println("1. 고속도로 2. 도로");
                    Roads();
                    times();
                    hipass_Exit(hi_B);
                    System.out.println("도시진입 초보자 모드로 전환합니다.");
                    Tiers(tier_N);
                }
                break;
            case 2 :
                if(choice == 1){
                    Tiers(tier_P);
                    System.out.println("1. 고속도로 2. 도로");
                    Roads();
                    times();
                    hipass_Exit(hi_B);
                }else if(choice==2){
                    Tiers(tier_P);
                    System.out.println("1. 고속도로 2. 도로");
                    Roads();
                    times();
                    hipass_Exit(hi_B);
                }
                break;
            case 3 :
                Tiers(tier_N);
                if(choice == 3){
                    System.out.println("초보자는 고속도로를 이용할 수 없습니다.");
                    road.Road_go();
                    times();
                    hipass_Exit(hi_B);
                }
                break;
            case 4: // 사용하지 않고 시스템 종료!
                exit = -1;
                System.out.println("프로그램 종료");
                break;
            default: // 잘못 입력했을 경우!
                System.out.println("다시 입력해주세요.");
                Mod();
                break;
        }
    }

    public void B_T() {
        int go = sc.nextInt();
        System.out.println("이용하실 교통수단을 선택해주세요. 1. 버스 2. 택시 3.종료");
        switch (go) {
            case 1:
                System.out.println("버스를 이용합니다.");
                hipass_In(hi_B);
                System.out.println("모드를 선택해주세요!");
                System.out.println("1. 전문가 모드 2. 숙련자 모드 3. 초보자 모드");
                System.out.println("초보자는 고속도로에 진입할 수 없습니다.");
                Mod();
                break;
            case 2:
                System.out.println("택시를 이용합니다.");
                hipass_In(hi_T);
                System.out.println("모드를 선택해주세요!");
                System.out.println("1. 전문가 모드 2. 숙련자 모드 3. 초보자 모드");
                System.out.println("초보자는 고속도로에 진입할 수 없습니다.");
                Mod();
                break;
            case 3: // 사용하지 않고 시스템 종료!
                exit = -1;
                System.out.println("프로그램 종료");
                break;
            default: // 잘못 입력했을 경우!
                System.out.println("다시 입력해주세요.");
                B_T();
                break;

        }

    }


}
