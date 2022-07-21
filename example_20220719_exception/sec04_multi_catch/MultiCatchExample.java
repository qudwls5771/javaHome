package sec04_multi_catch;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MultiCatchExample {
	public static void main(String[] arg) {
		try {
			//실패하는 경우 : Exception 발생(숫자로 변환할 수 없습니다.)
			String[] args = {"김병진", "이병진"};
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
			// | => 둘중에 하나가 아니면 출력
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개밧의 수가 부족하거나 숫자로 변환 할 수 없습니다");
		} catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
		} finally {
			System.out.println("다시 실행하세요");
		}
	}
}

