import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import package0004_gameSlimeLand.*;
import package0004_gameSlimeLand.inven.potion.RedPotion;
import package0004_gameSlimeLand.slime.NormalSlime;
import package0004_gameSlimeLand.slime.RedSlime;
import package0004_gameSlimeLand.slime.actionSlime;
import package0004_gameSlimeLand.slime.actionSlimeBludslime;
import package0004_gameSlimeLand.slime.actionSlimeRedslime;
import package0004_gameSlimeLand.slime.slime_notUse;
import package0005_invenItemOverridingExample.*;
import package0006_inheritanceExample.*;

import package0007_sandwich.*;
import package0010_exam.Child;
import package0010_exam.Sister;
import package0010_exam.Parent;
import package0010_exam.childClass_sandwich_anotherPackage;
import package0008_promotionExample.*;



public class main {

    public static void main(String[] arg) {

        // startSandwich();

        // startPromotion();

        TodoList();

        // CreateSlime();

        // startForIf();

        //답안쓰기

        

    }

    private static void TodoList() {

        Child Child_A = new Child("책가방", 3000);
        Child Child_B = new Child("손가방", 60000);
        Parent Child_C = new Child("서류가방", 100000);

        System.out.println("------CHAPTER1. 형변환 전 -------");
        Child_A.goToWork();
        Child_A.goToPCRoom();
        Child_A.buyBranch(50000);
        System.out.println("------child-------");

        Child_B.goToWork();
        Child_B.buyBranch(50000);
        Child_B.goToPCRoom();
        System.out.println("------Sister-------");

        Child_C.goToWork();
        Child_C.buyBranch(50000);
        // Child_C.goToPCRoom();
        System.out.println("------Parent-------");

        //자동형변환
        Parent Not_Child_A = Child_A;
        Parent Not_Child_B = (Parent)Child_B;
        Parent Not_Child_C = (Parent)Child_C;

        System.out.println("------CHAPTER2. 형변환 후 -------");
        Not_Child_A.goToWork();
        // Not_Child_A.goToPCRoom();
        Not_Child_A.buyBranch(50000);
        System.out.println("------child-------");

        Not_Child_B.goToWork();
        Not_Child_B.buyBranch(50000);
        // Not_Child_B.goToPCRoom();
        System.out.println("------Sister-------");

        Not_Child_C.goToWork();
        Not_Child_C.buyBranch(50000);
        // Not_Child_C.goToPCRoom();
        System.out.println("------Parent-------");

        // Parent[] Not_Child_Array = new Parent[3];
        // Not_Child_Array[0] = Child_A;

        // Not_Child_A.goToWork();
        //Not_Child_A.goToPCRoom();
        System.out.println();
        Child Child_AA = (Child)Not_Child_A; 
        // Sister Child_BB = (Sister)Not_Child_B; 

        Child_AA.goToWork();
        Child_AA.goToPCRoom();
        Child_AA.buyBranch(50000);
        System.out.println("------child-------");

        // Child_BB.goToWork();
        // Child_BB.buyBranch(50000);
        // // Child_BB.goToPCRoom();
        // System.out.println("------Sister-------");

        // Sister Child_E = (Sister)Not_Child_AA; 
        

    }

    private static void startForIf() {

        //for, if문을 만들어서 다음 도형을 만드세요
        //문제 1. 사각형
        //문제 2. 직각삼각형
        //문제 3. 일반삼각형
        //문제 4. 마름모
        //문제 5. 원형
        //어려운 문제. 얼굴 그리기

        int slimeCoordinateY = 4;
        int slimeCoordinateX = 3;
        

        //배열범위 설정
        int numX = 6;
        int numY = 7;
        int numZ = 3;

        CalcFor_0001.calcFor_0004(numY, numX);
        // CalcFor_0001.calcFor_0000(numX, numY);


    }

    public static void CreateSlime() {

        //슬라임을 매개변수로 넣어서 출력하기

        NormalSlime normalSlime = new NormalSlime();
        actionSlime basicActionSlime = new actionSlime();

        actionSlimeBludslime blueActionSlime = new actionSlimeBludslime();
        actionSlimeRedslime redActionSlime = new actionSlimeRedslime();

        normalSlime.getAction(blueActionSlime);
        normalSlime.getAction(redActionSlime);



        actionSlime basicActionSlime_A = new actionSlimeBludslime();
		method1(basicActionSlime_A);
		method2(basicActionSlime_A);
		
		actionSlime basicActionSlime_B = new actionSlime();
		method1(basicActionSlime_B);
		// method2(basicActionSlime_B); //예외 발생

 

        

        String[] arrSlimeName = new String[4];
        arrSlimeName[0] = "검은색";
        arrSlimeName[1] = "붉은색";
        arrSlimeName[2] = "푸른색";
        arrSlimeName[3] = "초록색";

        int num = (int)(Math.random()*arrSlimeName.length);

        int input_hp = (int)(Math.random()*100);
        int input_mp = (int)(Math.random()*30);
        RedSlime red_1_slime = new RedSlime(input_hp, input_mp, arrSlimeName[num], arrSlimeName[num]);
        input_hp = (int)(Math.random()*100);
        input_mp = (int)(Math.random()*30);
        RedSlime red_2_slime = new RedSlime(input_hp, input_mp, arrSlimeName[num], arrSlimeName[num]);

        red_1_slime.getColor();
        System.out.println(red_1_slime.getName()+"의 공격력은 "+red_1_slime.att());


        red_2_slime.getColor();
        System.out.println(red_2_slime.getName()+"의 공격력은 "+red_2_slime.att());

    }

    public static void method1(actionSlime parent) {
		if(parent instanceof actionSlimeBludslime) {
			actionSlimeBludslime child = (actionSlimeBludslime) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(actionSlime parent) {
		actionSlimeBludslime child = (actionSlimeBludslime) parent;
		System.out.println("method2 - Child로 변환 성공");
	}

    private static void startPromotion() {

        child child = new child();

        parent parent = child;

        parent.method1();

        parent.method2();

        // parent.method3();
    }

    private static void startSandwich() {

        childClass_sandwich_anotherPackage[] sandwichs = new childClass_sandwich_anotherPackage[5];

        ArrayList<childClass_sandwich_anotherPackage> abnc = new ArrayList<childClass_sandwich_anotherPackage>();

        abnc.add(new abocadosand("아보카도샌드위치","빵", "버터", "에그", "아보카도"));
        
        sandwichs[0] = new abocadosand("아보카도샌드위치","빵", "버터", "에그", "아보카도");
        sandwichs[1] = new baconsand("베이컨샌드위치","빵", "버터", "베이컨", "상추");
        sandwichs[2] = new baconsand("베이컨샌드위치","빵", "버터", "계란", "샐러드");
        sandwichs[3] = new baconsand("베이컨샌드위치","빵", "버터", "베이컨", "상추");
        sandwichs[4] = new pumkinsand("베이컨샌드위치","빵", "버터", "단호박");

        for(int i=0 ;i < 5; i++){
            sandwichs[i].getInfo("월요일");
        }
    }

   

    public static void ChangeWeapon() {
        
        WeaponLance001 lance = new WeaponLance001();
        WeaponLong001 long_1 = new WeaponLong001();

        lance.attAction();
        lance.destruction();

        long_1.attAction();
        long_1.destruction();
        
    }

    private static void weekTest() {
        //*특정 학생분들께 제공하는 조별 주말과제 입니다 */
        //김준석은 요리를 하려고 한다.
        //일 주일동안 점심식사 준비를 하려고 샌드위치를 만들려고 합니다.
        //월요일에는 블루베리베이컨 샌드위치(재료 : 빵, 버터, 블루베리, 베이컨), 
        //화요일에는 상추베이컨 샌드위치(재료 : 빵, 버터, 상추, 베이컨),
        //수요일에는 단호박 샌드위치(재료 : 빵, 버터, 단호박),
        //목요일에는 에그샐러드 샌드위치(재료 : 빵, 버터, 계란, 샐러드),
        //금요일에는 아보카도에그 샌드위치(재료 : 빵, 버터, 아보카도, 계란)를 만들려고 합니다.
        //class Sandwich를 상속받은 다양한 샌드위치 class를 만들어서 
        //(배열)특정 요일에는 특정 샌드위치를 먹는다는 System.out.println을 출력하시오.
        //더불어 특정 샌드위치의 재료를 출력하는 System.out.println을 만들어 출력하시오.
    }

    private static void usePotion() {
        //용사의 인벤토리에 아이템 번호를 가지고 포션을 사용합니다
        RedPotion redpotion = new RedPotion(30, 1, "하얀색");
        RedPotion redpotion_x3 = new RedPotion(30, 3, "빨간색");
        RedPotion redpotion_xRandom = new RedPotion(30, 2);

        // redpotion.usePotionText();
        int effectHP = redpotion.useItem(20);
        int effectHP_x3 = redpotion_x3.useItem(41);
        int effectHP_xRandom = redpotion_xRandom.useItem(52);

        System.out.println("용사는 포션을 사용하여 HP "+effectHP+"를 회복하였습니다");
        System.out.println("용사는 포션을 사용하여 HP "+effectHP_x3+"를 회복하였습니다");
        System.out.println("용사는 포션을 사용하여 HP "+effectHP_xRandom+"를 회복하였습니다");
    }


    private static void SlimeGo() {
        RedSlime redslime = new RedSlime(20, 30, "red", "예쁜이");

        redslime.initSlime();
        redslime.getColor();
        
    }


    private static void inheritanceExample() {
        //DmbCellPhone 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone으로부터 상속 받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//CellPhone으로부터 상속 받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();

		//DmbCellPhone의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
    }

    private static void GameStart() {
        //슬라임과 대치하는 용사 상황을 코드로 구현
        //용사를 만들자 , 용사 객체 생성(1명)

        //string 메모리를 적게 쓰는 법
        String input = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("용사를 정해주세요");
        //키보드 입력값을 input 변수에 할당
        input = scan.nextLine();

        Warrior warrior = new Warrior(input, 1000, 5000);

        //while문 (슬라임과 용사가 열심히 반복적으로 싸우는 구역)
        while(true) {

            warrior.info();

            //텍스트 랜덤으로 입력값 받기 (랜덤함수와 아스키코드로 랜덤 출력)
            //슬라임 몬스터 생성(다수)
            String input_name_1 = "노란 슬라임";
            String input_name_2 = "빨간 슬라임";
            String input_name_3 = "초록 슬라임";
            String input_name_4 = "파란 슬라임";
            int input_hp = 30;
            int input_mp = 3;
    
            slime_notUse slime_A = new slime_notUse(input_name_1, input_hp, input_mp);
            slime_notUse slime_B = new slime_notUse(input_name_2, input_hp, input_mp);
            slime_notUse slime_C = new slime_notUse(input_name_3, input_hp, input_mp);
            slime_notUse slime_D = new slime_notUse(input_name_4, input_hp, input_mp);

            slime_A.info();
            slime_B.info();
            slime_C.info();
            slime_D.info();

            slime_A.dmg(warrior.attRang);

          

            //슬라임 증식을 한다

            //용사의 공격(1턴)
           
        
            //슬라임의 공격(1턴)
         
           
            //if(모든 슬라임이 죽을 경우) break;
        }
    
    }
}