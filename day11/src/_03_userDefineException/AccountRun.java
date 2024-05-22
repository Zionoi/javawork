package _03_userDefineException;

import _01_anonymous.TestMain; // 같은 프로젝트의 다른 패키지의 것을 쓰려면 그냥 import만 해주면된다
import _03_bank.T01_api_bank; // 다른 프로젝트의 api를 쓰려면 프로젝트 속성(property)에 프로젝트 탭에서 쓰고싶은 api가 들어있는 프로젝트를 포함시킨후 import해야함

public class AccountRun {

	public static void main(String[] args) {
		T01_api_bank b = new T01_api_bank();
		TestMain aa = new TestMain();
		
		
		Account bank = new Account();
		bank.Deposit(1000);
		System.out.println(bank.getBalance());
		try {
			bank.witdraw(2000);
			System.out.println(bank.getBalance());
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
