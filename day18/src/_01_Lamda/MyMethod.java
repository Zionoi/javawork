package _01_Lamda;

//함수식에서 사용하는 인터페이스넌 어노테이션을 달아줄수 있음
//함수식 interface를 체크하는 어노테이션 -> 추상메소드가 1개인지를 체크해줌
@FunctionalInterface
public interface MyMethod {
	//아규먼트(매게변수)가 없는 메소드를 구현해보자
	 //이부분은 생략가능. 컴파일시 자동으로 붙여줌
	/*public abstract*/ void method(); // 함수식에서 인터페이스는 추상메소드 하나만 가질수 있다.
	
	

}
