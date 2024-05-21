package _04_interface;

public class T00_interface {

	public static void main(String[] args) {

		/* 인터페이스란?
		    전부 추상 메소드
		  개발 코드와 객체가 서로 통신하는 접점
		  	일종의 추상클래스. 추상클래스보다 추상화 정도가 높다
		  	-실제 구현된 것이 전혀 없는 기본 설계도.(알맹이 없는 껍데기)
		  	-추상메서드와 상수를 멤버로 가질수 있다. -> 디폴트 메서드와 static메소드도 가질수 있다
		  	-인스턴스를 생성할 수 없고, 클래스 작성에 도움을 줄 목적으로 사용된다. -익명객체는 생성가능
		  	-미리 정해진 규칙대로 사용할수있게 제시하는 용도
		  	-일반 변수를 넣을수없고 상수(final)만 사용해야함
		  	
		   전부 추상 메소드
		  개발 코드와 객체가 서로 통신하는 접점
		  
		  인터페이스 작성
		  class대신 interdface를 사용한다는것 외에는 클래스 작성과 동일하다.
		  ex
		  interface 인터페이스이름{
		  	public static final 타입 상수이름 = 값; //상수만 사용가능 일반변수 사용못함. interface에 선언할때는 자동으로 붙음
		  	public abstract 메서드이름(매개변수목록); 
		  
		  interface는 생성자 생성 불가능
		  
		  선언과 동시에 초기값 지정
		  - static{} 블록 작성 불가 - static{} 으로 초기화 불가능
		  }
	*/
	}

}
