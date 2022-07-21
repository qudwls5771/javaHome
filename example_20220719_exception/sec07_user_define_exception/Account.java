package sec07_user_define_exception;

public class Account {
	//자바만 유일하게 long 8byte
	private long balance;

	public Account() { }	

	public long getBalance() {
		return balance;
	}	
	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고 부족:"+(money-balance)+"모자람");
		}else if(balance < money){
			balance -= money;
		}
	}
}

