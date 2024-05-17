package _01_static;

public class T01_main_static {
	//메인에서도 인스턴스필드,정적변수, 정적메소드 사용가능. 클래스 바로아래 적으면 됨
	
	int a; 
	static int b; // static이 붙은걸 호출할때는 static이 들어있는 클래스를 변수이름앞에 붙인다. ex) T01_api_static.nameSt
	public static void main(String[] args) {
		int c; // 초기화 안됨 출력시 오류
//		System.out.println(a); // 오류의원인- 인스턴스 변수는 반드시 객체를 생성해야만 사용가능
//		System.out.println(c); // 오류의원인- 지역변수를 초기화하지 않고 출력했기 때문

		// static 키워드가 있는 클래스 변수, 클래스 메소드는 객체 생성 하지 않아도 사용가능
		System.out.println(b);
		System.out.println(T01_api_static.nameSt);
		System.out.println(T01_api_static.sMe4());
		System.out.println("------------------");
		//System(클래스).out(변수이름) 이것도 out앞에 static이 붙어서 객체생성안하고 사용가능
		
		//인스턴스 변수, 인스턴스 메소드는 반드시 객체를 생성해야 사용가능
		T01_api_static s1 = new T01_api_static();
		System.out.println(s1.numIn);
		System.out.println(s1.me2());
		
		//객체에서도 클래스 변수, 클래스 메소드 사용가능
		System.out.println(s1.numSt);
		System.out.println(s1.sMe4());
		//사용은 가능하지만 되도록 클래스이름으로 사용하길 권장함(사용자가 보기에 인스턴스변수로 착각 할 수 있음)
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
