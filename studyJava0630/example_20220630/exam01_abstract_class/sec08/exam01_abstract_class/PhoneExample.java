package studyJava0630.example_20220630.exam01_abstract_class.sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); (x)
		
		// new 인스턴스 해준거임 -> 자식 거 가지고 온거.
		Phone phone = new SmartPhone("홍길동"); 

		//형변환
		Phone ph = (SmartPhone) new SmartPhone("홍길동"); 


		//Phone phone = new Phone();  - > 추상클래스는 인스턴스시킬 수 없다.

		
		//	smartPhone.internetSearch();
		phone.turnOn();
		phone.turnOff();

		System.out.println("------형변환-----");

		ph.turnOff();
		ph.turnOn();



	}
}
