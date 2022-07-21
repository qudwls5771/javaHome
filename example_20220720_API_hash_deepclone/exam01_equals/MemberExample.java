package sec03.exam01_equals;

public class MemberExample {
	//main 클래스는 프로그램이 시작할 때 처음 동작하는 메서드( 객체 안에 무조건 메서드가 있고, 실행시킨다)
	//String[] 배열은 OS(윈도우)에서 초기에 데이터를 받는 입구
	//public : 접근제한자로써 모두 다 접근 가능
	//static : 프로그램에서 딱 1개로 인스턴스로 못 만듬
	//void : return 값이 없어서 메서드가 실행되고 바로 끝

	public static void main(String[] args) {

		//인스턴스 생성
		//선언 부분 : (선언)Member 타입으로 obj1 변수명으로 선언
		//= : 대입 연산자 (우측에 있는 인스턴스를 좌측에 있는 선언부분에 할당(연결)
		//new : 인스턴스 부분으로 실제로 메모리에 할당되는 값,
		//(실제)Member타입으로 실제로 구현(생성자:인자값 String 넣기)
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		//메모리에 obj라는 객체가 3개 할당된 상황(주소값)

		//재정의 된 equals 사용
		if(obj1.equals(obj2)) { //obj1와 obj2 객체를 비교(단, 참조타입이여서 eqauls메서드를 써서 비교)
			//기본 타입끼리 비교할 때에는 == 사용
			System.out.println("obj1 obj2 같음");
		} else {
			System.out.println("obj1 obj2같지 않음");
		}

		if(obj1.equals(obj3)) {
			System.out.println("obj1 obj3같음");
		} else {
			System.out.println("obj1 obj3같지 않음");
		}

		//obj3 라는 변수명(선언부분)에 obj2의 실제값을 대입
		//기존, obj3에 할당된 인스턴스 대신에 obj2의 인스턴가 연결되어서
		//원래 있던 obj3에 할당된 인스턴스는 연결 끊어짐(가비지 컬렉터가 찾아서 회수)
		obj3 = obj2;
		if(obj2.equals(obj3)){   //같은 인스턴스 주소를 가르키기 때문에
			//인스턴스가 같다고 보고, if문의 True값이 나옴
			System.out.println("obj2 obj3 같음");
		} else {
			System.out.println("obj2 obj3같지 않음");
		}
	}
}