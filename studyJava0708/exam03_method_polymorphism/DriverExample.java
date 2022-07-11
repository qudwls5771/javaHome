package studyJava0708.exam03_method_polymorphism;

import java.lang.reflect.Method;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.B_T();

		Vehicle taxi1 = new Taxi();
		Vehicle bus1 = new Bus();





	}


}

//버스와 택시에 인터페이스를 추가 (인터페이스의 다양성을 추가해서 기능 강제성 구현)
//1. 요금 납부 인터페이스, 하이패스 인터페이스를 만드시고 구현하세요
//하이패스는 요금 납부를 상속받습니다.
//버스는 하이패스를 쓰지 않습니다.

//형변환 (객체 상속과 형변환을 통해 유연한 객체활용)
// 2. (객체)형변환 > 뎁스를 만들기 위해. 드라이버는 초보자, 숙련자, 전문가로 나뉩니다.
// 초보자는 속도를 30km 준수하고, 숙련자는 60km, 전문가는 100km로 달립니다.
// 고속도로를 달릴 수 있는 것은 전문가에요. 고속도로를 달릴 때만 전문가 타입으로 변환해서
// 고속도로를 달리세요. 톨게이트를 빠져나가면 초보자로 바꾸는 드라이버가 있습니다.
// (기본)형변환을 통해 System.out.println로 천안에서 고속도로 타고 서울까지 가는 문구를
// 출력하시오.


//추상 클래스와 인터페이스를 왜!? 쓰는지와 어떤 경우에 쓰는지 고민