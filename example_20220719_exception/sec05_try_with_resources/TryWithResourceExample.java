package sec05_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
		//try가 끝나면 메모리를 닫아준다.
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			//메모리에 계속 남는다.
			fis.read();
			//메모리 문제 해결 닫아준다. = 자원을 쓰면 닫아준다.
			fis.close();
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외처리 코드가 실행되었습니다");
		}
	}
}
