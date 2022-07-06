package example_20220706.exam01_field_polymorphism;

public class Car {
	
	//필드값을 인스턴스로 만들어줌
	public Tire frontLeftTire = new HankookTire();
	public Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();


	Number01_brake num1 = new Number01_brake();
	Brake brake01 = new Number01_brake();
	Brake brake02 = new Number02_brake();

	public Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};

	public void run_(){
		num1.push();
		num1.stop();

		System.out.println("----------run01-----------");

		brake01.stop();
		//brake01.push(); -> 인터페이스 브레이크에는 push가 없어서 안됨

		System.out.println("----------run02-----------");

		//자식클래스 변수 = (자식클래스)부모타입클래스타입
		Number01_brake brake02 = (Number01_brake) brake01;
		brake02.push();

		System.out.println("----------run03-----------");
		frontRightTire = new HankookTire();
		brake02.defaultmethod_install_pedal(frontRightTire);
		frontRightTire = new KumhoTire();
		brake02.defaultmethod_install_pedal(frontRightTire);
		frontRightTire = new newHankookTire();
		brake02.defaultmethod_install_pedal(frontRightTire);

	}


	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();

		// Tire 라는 배열의 타입 : 배열
		for(Tire tire : tires){
			//매개 변수
			tire.roll();
		}

	}
}
