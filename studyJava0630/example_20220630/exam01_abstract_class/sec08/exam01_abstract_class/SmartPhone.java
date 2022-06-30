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
}
