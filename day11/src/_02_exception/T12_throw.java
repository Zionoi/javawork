package _02_exception;

public class T12_throw {

	public static void main(String[] args) {
		// throw와 throws
		
	/* 메서드에 예외 선언하기
		- 예외를 처리하는 또 다른 방법
		- 사실은 예외를 처리하는 것이 아니라, 호출한 메서드로 전달해주는 것
  		- 호출한 메서드에서 예외처리를 해야만 할 때 사용
		
		예외 떠넘기기
		예외를 메서드에서 선언할땐 throws
		void method() throws Exception1, Exception2, ... ExceptionN {
			// 메서드 내용
		
		}

	
	예외 발생시키기
	1. 먼저, 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다음
	  		Exception e = new Exception("고의로 발생시켰음");
	  		
	2. 키워드 throw를 이용해서 예외를 발생시킨다.
			throw e;  		


	*/
		// throw : 강제로 예외발생 시킬때
		// throws : 메소드를 호출하여 사용할 때 발생할 수 있는 예외를 명시해 두고
//					그 메소드를 사용할 때에 예외에 대한 대비를 해줘야 함
		
		try {
			Exception e = new Exception("강제로 예외발생 시킴");
			throw e;
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			// 사용자 정의로 Exception을 사용할 때 사용
		}
		
		
		
	}

}
