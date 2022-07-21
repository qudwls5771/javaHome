package sec07_user_define_exception;

public class BalanceInsufficientException extends Exception {

	private int exceptionCount = 0; //예외처리 카운트

	public BalanceInsufficientException() { }
	public BalanceInsufficientException(String message) {

		super(message);
		exceptionCount++;
	}
}

