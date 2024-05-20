package _07_polymorphismArray;

public class Tv extends Product {

	Tv() {
		super(300);
		
	}
	@Override
	public String toString() { //public을 해줘야함
		return "Tv"; // toString을 함으로 변수명 출력시 주소값이아닌 이스트링 문자열로 출력됨
	}
	
	
	/*
	 main에서 
	 Tv tv = new Tv();
	 System.out.println(tv);   // _06_polymorphismEx;.Tv@0c321x933656  // 오버라이딩전은 이렇게 출력
	 System.out.println(tv);   // Tv //오버라이딩하면 이렇게 출력됨
	
	
	
	*/
	
	
	
	
}
