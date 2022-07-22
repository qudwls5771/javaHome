package sec03.exam02_hashcode;

public class Key {
	//필드 : number, enc
	public int number;
	public int enc;

	//생성자(int number를 매개변수로 받음)
	public Key(int number) {

		//this(제일 가까운 객체인 Key라는 class를 가르킴
		//this.number >> Key라는 클래스의 number라는 필드값을 가르킴
		//= number >> 매개변수 number가 this.number에 할당 됨
		this.number = number;
		this.enc = 2300;
	}
	//메서드: 이 인스턴스가 갖고 있는 기능!
	//메서드 equals는 Object에 있는 equals메서드를 재정의해서 사용하겠다!
	//모든 클래스는 Object라는 클래스에서 시작되며, 상소받습니다!
	//equals를 재정의 해서 새로운 비교구문을 스스로 만들기!
	//@ : 어노테이션은 아래 메서드의 성질을 JVM에게 선언해주는 구문
	//(JVM이 Key클래스에 있는 equals라는 메서드가 Object에서 상속받은 메서드가 아닌
	//재정의 된 메서드인 것으로 인식할 수 있도록 @ 어노테이션 Override라서 선언
	//boolean : 이 메서드가 실행되고 최종적으로 반환(리턴)되는 "타입"이 boolean(True/False 둘 중 하나)
	//(Object obj) : 매개변수로써 어떤 인스턴스든 Object로 "형변환" 된다
	//모든 객체(메서드)는 입구(통로)는 매개변수이기 때문에
	//Object로 "자동형변환" (Object obj) >> 하면 모든 클래스의 부모는 Object이기 때문에 가능
	//모든 클래스로 매개변수로 받을 수 있으므로 자바(객체)의 다형성을 표현한다.
	//어던 클래스든 Object 객체를 모두 상속받기 때문에 최고 부모 클래스인 Object로 "자동 형변환"이 가능하다
	//어디까지나 타입의 형변환입니다 (인스턴스 타입이 바뀌는 게 아닙니다~
	//(Heap메모리에 있는 인스턴스가 바뀌는 것은 아닙!)
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			//compareKey는 obj의 Key타입 형변환 내용을 대입받는다
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	//주소 + 31(홀수 > 특정연산작업속도를 간략히) + 기타등등(컴퓨터의 기초 메타데이터)
	//Hashcode() 메서드는 equals() 메서드랑 동일하게 Object 클래스(최상의 부모클래스)의 메서드
	//어떤 클래스나 Object클래스를 상속받기 때문에 hashcode()와 equlas() 메서드를 쓸 수 있다.



	@Override
	public int hashCode() {
		//2300 +23 = 2323으로 나옴
		// return number+enc;
		//String 문자열은 상수풀이기 때문에 같은 주소를 가르킬 것이고

		return number;
	}
}
