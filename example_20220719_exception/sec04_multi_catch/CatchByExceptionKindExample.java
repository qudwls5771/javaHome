package sec04_multi_catch;

public class CatchByExceptionKindExample {
	public static void main(String[] arg) {
		try {
			//성공하는 경우
			String[] args = {"1", "2", "3"};
			//실패하는 경우 : Exception 발생(매개 변수가 부족)
			//String[] args = {"1"};
			//실패하는 경우 : Exception 발생(숫자로 변환할 수 없습니다.)
			//String[] args = {"김병진", "이병진"};
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족");
			System.out.println("[실행 방법]");
			System.out.println("java CatchByExceptionKindExample  num1  num2");
			//예외 정보 말하기
			e.printStackTrace();
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환 할 수 없습니다");
		} finally {
			System.out.println("완료");
		}
	}
}
