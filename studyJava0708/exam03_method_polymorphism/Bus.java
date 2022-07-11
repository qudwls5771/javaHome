package studyJava0708.exam03_method_polymorphism;

public class Bus implements Vehicle, hiPass {
	String name = "버스";

	@Override
	public void run() {
		System.out.println(this.name+" 달린다.");
	}

	@Override
	public void Tiers() {

	}

	@Override
	public void highPass() {
		System.out.println(this.name + "는 하이패스 무료입니다.");
	}

	@Override
	public void exit() {
		System.out.println(this.name + "가 하이패스 구간을 나옵니다.");
		System.out.println("하이패스 종료");
	}
}
