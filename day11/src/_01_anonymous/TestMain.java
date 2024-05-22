package _01_anonymous;


class Parent {
	String method() {
		return "부모의 재산";
	}
}
class Child extends Parent{
	@Override
	String method() {
		return "자식의 재산";
	}
}

public class TestMain {
	public static void main(String[] args) {
	
		Parent p = new Child();
		System.out.println(p.method());
	
		
		// 익명 클래스 : 재사용할 필요가 없을 때 1번만 정의하여 사용
		//				1번만 사용하는데 클래스를 만드는것은 비효율적임
		Parent p2 = new Parent() { // 반드시 변수에 넣어줘야함. 자료형은 부모형이던 자식형이던 상관 없음
			int age = 25;
			@Override
			String method() {
				System.out.println(age);
				return "다 내꺼";
			}
		};
		
		System.out.println(p2.method());
		
		
	
		
		/* 오류의 종류
			에러 (Error)
			-하드웨어의 잘못된 동작 또는 고장으로 인한 오류
			-에러가 발생되면 프로그램 종료
			-정상 실행 상태로 돌아갈 수 없음
			
			
			예외 (Exception)
			- 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인한 오류
			- 예외가 발생되면 프로그램 종료
			- 예외 처리 추가하면 정상 실행 상태로 돌아갈 수 있음.
	
			일반(컴파일 체크)예외(Exception)
			-예외 처리코드 없으면 컴파일 되지 않는 예외
			
			실행 예외 (RuntimeException)
			- 예외 처리코드를 생햑하더라도 컴파일 되는 예외
			- 경험에 따라 예외 처리 코드 작성 필요

	
	
		*/
	
}	
}
