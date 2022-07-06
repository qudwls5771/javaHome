package example_20220706.exam01_field_polymorphism;

public class HankookTire implements Tire {
	@Override
	public void roll() {
		System.out.println("한국 타이어");
	}
}
