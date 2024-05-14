package _02_method;

public class T01_api_method {
		//반환형이 없는 메소드
	void print1() {
		//주의 : 반환형이 없는 메소드는 main 클래스에서 변수에 저장할 수 없고, 출력할 수 도 없다
		System.out.println("반환값이 없고 매개변수도 없는 메소드");
	
	}
		// 반환형이 있는 메소드
	int print2() {
		System.out.println("반환값이 int고 매개변수는 없는 메소드");	
		return 10;
		
	}

	
	String print3() {
		System.out.println("반환값이 String고 매개변수는 없는 메소드");
		return "반환되는 문자";
	}
	
	
	//매개변수
	void print4(int x) {
		System.out.println(x);
	}
	
	int pirnt5(int x, int y) {
		return x+y;
		/*
			or int result = x+y
		 	return result; //이렇게 해도 된다
		*/
	}
	
	void print6 (String str, int z) {
		System.out.println("입력한 문자열 : " + str);
		System.out.println("입력한 숫자 : "+z);
	}
	
	
	
	
	
}
