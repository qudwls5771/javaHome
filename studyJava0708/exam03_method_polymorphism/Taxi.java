package studyJava0708.exam03_method_polymorphism;

public class Taxi implements Vehicle, hiPass {
	String name = "택시";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(this.name+" 달린다.");
	}

	@Override
	public void highPass() {
		System.out.println(this.name + "하이패스 요금 : 2000원 입니다.");
	}

	@Override
	public void exit() {
		System.out.println(this.name + "가 하이패스 구간을 나옵니다.");
		System.out.println("하이패스 종료");
    }

	@Override
	public void Tiers() {

	}
}
