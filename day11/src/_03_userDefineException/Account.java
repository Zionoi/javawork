package _03_userDefineException;

public class Account {
	private int balance;

	void Deposit(int money) { //입금 메소드
		balance += money;
	}
	// 출금 메소드
	void witdraw(int money) throws UserException { //익셉션
		if(money>balance) 
			throw new UserException("잔고 부족 : "+(money-balance)+"원이 모자람"); // 강제 익셉션 만들어줌
		else 
			balance -= money;
	}
	int getBalance() { // 통장잔고 금액값 얻어오는 메소드 
		return balance;
	}
}
