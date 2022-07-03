package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner) {
		super(owner); // 부모클래스의 생성자를 쓴다.
	}
	//메소드 
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
		//메소드
		@Override
		public void turnOn() { // 인터페이스는 메소드 안에 실행문이 없다. 추상은 있다.
			System.out.println("자식 : 스마트폰 전원이 켜졌습니다.");
		}	
		@Override
		public void turnOff() {
			System.out.println("자식 : 스마트폰 전원이 꺼졌습니다.");
		}
}
