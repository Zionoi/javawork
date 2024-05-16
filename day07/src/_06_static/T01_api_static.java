package _06_static;

public class T01_api_static {
	// 인스턴스 필드(속성) 인스턴스 변수 (클래스 바로 밑에 만들어져있음)
	int num = 10; 		// 변수
	final int MAX = 25; // 상수(변수값 변경이 안됨.)  상수는 구분을 위해 대문자로 변수명 만드는걸 권장함. (반드시는 아님)
//	int MAX =25;		// 변수


//메소드
	void method() { // 매개변수도 지역변수
		int me1 = 3; //메소드안 지역변수
		System.out.println(me1);
	}
	//정적필드(속성) static이 붙음 (공동으로 사용함)
	static int sNum = 20;
	static String sName = "김요한";

}
