package example_20220706.exam01_field_polymorphism;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		System.out.println("----check01----");
		myCar.run();

		//스트링 값을 바꾼다.
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();

		System.out.println("----check02----");
		myCar.run();

		System.out.println("----check03----");
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();

		myCar.run();
		
		//브레이크, 패달

		System.out.println("----브레이크 패달----");
		myCar.run_();


	}
}
