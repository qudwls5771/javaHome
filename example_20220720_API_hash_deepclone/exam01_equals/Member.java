package sec03.exam01_equals;

public class Member {
	//필드!!
	public String id;
	//생성자!!(클래스를 토대로 인스턴스를 처음 만들 때 세팅하는 거)
	//String 매개변수 id를 받아서 필드값 id에 할당(전달, 대입)
	public Member(String id) {
		this.id = id;
	}

	//메서드 : 이 인스턴스가 갖고 있는 기능!
	//메서드 : Object에 있는 equal메서드를 재정의!
	//오버라이딩은 상속을 받아서 재정의하는 것, Member는 상속은 어디서?
	//모든 클래스는 Object라는 클래스에서 시작되며, 상속을 받습니다. ★
	//equals를 재정의 해서 새로운 비교구문을 스스로 만들기
	//@ : 어노테이션은 아래 메서드의 성질을 JVM에게 선언해주는 구문
	//(Object obj) : 매개변수로써 어떤 인스턴스든 Object로 "형변환"된다.
	//Object 객체를 모두 상속 받기 때문에 최고 부모 클래스인 Object로 "자동" 형변환이 가능하다.
	//어디까지나 타입의 형변환 (인스턴스의 타입이 바뀌는 건 아니다.)
	//Member obj4 = new Member("blue"); => Object obj4 = new Member("blue");
	@Override
	public boolean equals(Object obj) { //blooean이 리턴 타입이라 True, False중에 하나 반환
		//실제로 구현된 인스턴스의 타입은 Member 이기 때문에 if문에 true가 출력
		if(obj instanceof Member) {
			//Member 타읍으로 obj매개변수를 형변환
			//Member라는 변수명으로 obj(주소) 연결
			Member member = (Member) obj;
			//id = member 필드값
			//id = String이기 때문에 참조타입이므로 equals를 통해 비교
			//인스터스의 id라는 필드값과 매개변수 obj(member)의 id 비교
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}