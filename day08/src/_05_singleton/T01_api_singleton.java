package _05_singleton;
// 싱글톤 : 전체 프로그램에서 단하나의 객체만 만들도록 보장하는 기법
//		: 메인실행클래스에서 객체를 만들지 못하도록 해야함(생성자 앞에 private붙이기)

public class T01_api_singleton {
	//인스턴스 변수에서 static으로 정적변수로 변환. 그럼 main에서 변수명으로 호출 가능. 그러나 보통 얘도 private해두고 메소드를 따로 만든후 따로 겟해서 사용함
	private static T01_api_singleton singleton = new T01_api_singleton();
	
	
	private T01_api_singleton() {//main에서 객체생성 못하도록 private으로 막아둠
	System.out.println("객체 생성");	
	
	}
	
	//반환형 메소드명() { 클래스 자료형이여야함.
	
   //}
	// 인스턴스 메소드 => 정적 변수 바꾸어줌 그래야 호출할 수 있음
	static T01_api_singleton getSingleton() {
		return singleton; //변수가 (static)정적필드임
	}	//정적메소드에서는 정적필드만 사용가능 그래서 변수앞에 static붙어야됨
	
}
