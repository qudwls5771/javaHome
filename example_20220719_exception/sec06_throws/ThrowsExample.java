package sec06_throws;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass(); // => ClassNotFoundException 에러 발생!
			System.out.println("성공");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}
	}


	public static void findClass() throws ClassNotFoundException {
									//java.lang.String => 이걸로 하면 성공
		Class clazz = Class.forName("java.lang.String2");
	}
}

