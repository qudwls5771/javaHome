package package0001_calc;

public class Car {
	// class car
	public String company = "company_1";
	public String model = "genesis_1";
	public String color = "black";
	public int maxSpeed = 350;
	public int speed;

	public int speedCheck() {
		int methodStackTest = 20;
		int fieldData = maxSpeed;
		System.out.println("fieldData = " + methodStackTest);
		System.out.println("fieldData = " + fieldData);
		fieldData += 10;
		System.out.println("fieldData fix = " + fieldData);
		System.out.println("maxSpeed = " + maxSpeed);

		return fieldData;
	}
}