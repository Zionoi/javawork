package _01_Lamda;


public class T01_lamda {

	public static void main(String[] args) {
		// 람다식 : 보통 자바스크립트에서 많이 사용함.
		// 자바 프로그래밍에서는 많이 사용하지 않음
		// 익명함수를 제공하기 위함
		/*
		자바에서 람다식을 수용한 이유
		- 코드가 매우 간결해진다.
		- 컬렉션 요소(대용량 데이터)를 필터링 또는 매핑해 쉽게 집계
		*/

		/*//ex
		 이걸
		int max( int a, int b) {
			return a>b ? a : b;
		}*/
//		이렇게 바꿀수 있음
		/*
		 매개변수가 두개일땐 가로를 꼭 해줘야함. 하나일땐 넣어줘도 되고 안넣어도 된다. 
		 (a,b) -> a>b ? a:b
		*/
	
		
		
		// 람다식 사용할 때 사용하는 interface
		// 1. 추상메서드로 구현 (인터페이스니까)
		// 2. 추상메서드가 반드시 한개만 있어야함
		MyMethod mm1 = new MyMethod() {


			@Override
			public void method() {
				System.out.println("method() call");
				
			}
		};
		mm1.method();

		// 위에 코드를 람다식으로 변환하면
		mm1 = () -> { // 저장할 경우엔 mm1에다가
			System.out.println("람다에서 출력");
		};
		// 위에 정의한 메소드를 출력하려면 메소드를 호출해야한다
		mm1.method();
		
		//람다식 구현부가 한줄이면 {}괄호없이 한줄로도 가능
		mm1 = () -> System.out.println("람다2에서 출력");
		mm1.method();
		
		
		

	}

}
