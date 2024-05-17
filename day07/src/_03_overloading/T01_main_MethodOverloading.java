package _03_overloading;


class Over { // 클래스를 하나더 생성함
	// 메소드 오버로딩 이란?
			/*하나의 클래스에 같은 이름의 메소드를 여러 개 정의하는 것을 메소드 오버로딩 간단히 오버로딩이라고한다
			 overload - vt 과적하다 부담을 많이 지우다
			 
			 조건
			 - 메소드 이름이 같아야 한다
			 - 매개변수의 개수 또는 타입이 달라야 한다
			 - 매개변수는 같고 리턴타입이 다른경우는 오버로딩 성립x
			 - 리턴타입은 오버로딩 구현하는데 아무런 영향을 주지 못한다 
			*/  
			  
	
	//오버로딩의 조건
	//1. 메서드 이름이 같아야 한다
	//2. 매개변수의 개수가 다르던지 자료형이 달라야 한다.
	
	
	//앞에 자료형은 상관없이 변수의 이름이 같고()소괄호 안에 변수가 달라야 오버로딩이 된다
	int add() {
		return 0;
	}
	int add(int num1) { //오버로딩 가능조건중 하나인 매개변수 갯수 차이 
		return num1;
	}
	int add(int num1, int num2) {
		return num1 + num2;
	}

	
	double add(int num1, double num2) { // 리턴 자료형은 상관없음
		return num1 + num2;
	}
	
	String add(String name) {
		return "이름 : "+name;
	}	
	
}

public class T01_main_MethodOverloading {

	public static void main(String[] args) {
		Over o1 = new Over();
		 o1.add(3,5); // 8
		 System.out.println(o1.add(3,5));
		 System.out.println(o1.add(3,5.0)); //8.0
		 System.out.println(o1.add()); //0
		 System.out.println(o1.add(7));
		 System.out.println(o1.add("김요한"));
	}

}
