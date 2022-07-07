package studyJava0630.example_20220630.exam01_abstract_class.sec08.exam01_abstract_class;

public abstract class Phone {//추상 클래스 = 인스턴스 X
	//필드
	public String owner;
	
	//생성자, overloading // 오버로딩과 오버라이드의 차이 : 생성자, 메소드, 재정의
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() { // 인터페이스는 메소드 안에 실행문이 없다. 추상은 있다.
		System.out.println("부모 : 핸드폰 전원을 켭니다.");
	}	
	public void turnOff() {
		System.out.println("부모 : 핸드폰 전원을 끕니다.");
	}
}
