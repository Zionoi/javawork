package _03_bank;

public class T01_api_bank {
	private int balance; // 통장 잔고
	
	void Deposit(int money) { //입금 메소드
		balance += money;
	}

	void witdraw(int money) { //출금 메소드
		/*		if(balance < money)
					System.out.println("잔액이 부족합니다.");
				else
					balance -= money;*/
		if(money<balance)
			balance -= money;
		else
		System.out.println("잔액이 부족합니다.");

	
	
	
	
	}
	int getBalance() { // 통장잔고 금액값 얻어오는 메소드 
		return balance;
	}
}
