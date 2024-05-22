package _03_userDefineException;

public class UserException extends Exception{ // 사용자정의익셉션을 만들땐 꼭 가장상위클래스인 Exception을 상속받아야한다.
	
	//사용자정의 익셉션의 생성자는 아래 두개가 필수이다
	public UserException() { }
	public UserException(String message) {
		super(message);
		
	}
	
	

}
