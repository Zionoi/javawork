package _01_static;

public class T01_api_static {
	//인스턴스 필드
	int numIn = 3;
	String name = "인스턴스 변수입니다";
	
	//정적필드 
	static int numSt = 10; //정적변수
	static String nameSt = "김정적필드";
	
	
	
	//메소드도 인스턴스메소드, 정적메소드 나뉨
	
	// 인스턴스 메소드
	void me1() {
		// 인스턴스 메소드를 호출한다는것은 이미 객체가 생성되어 있다는 말
		// 인스턴스 변수, 클래스 변수, 메소드 모두 호출가능 
			System.out.println("인스턴스 메소드 me1()");
			System.out.println(numIn);
			System.out.println(numSt);

	}
	
	String me2() {
		System.out.println("인스턴스 메소드 me2()");
		return "me2()";
	}
	
	
	//정적메소드
	static void sMe3() {
		// 클래스에 저장공간이 있으므로 객체를 생성하지 않고도 사용가능
		// 인스턴스 변수는 사용불가 인스턴스 변수와 메소드는 반드시 객체가 생성되어야만
		// 사용할 수 있기 때문
		System.out.println("정적 메소드 sMe3()");
		System.out.println(numSt);
//		System.out.println(numIn); 오류
		//정적메소드에서 인스턴스필드를 사용하려면 객체생성을 먼저해야한다
	}
	
	static String sMe4() {
		System.out.println("정적 메소드 sMe4()");
		return "sMe4";
	}
	
	
	
	
	
	
	
	
	
}
