package _08_polymorphismArrayList;

public class Computer extends Product {

	Computer() {
		super(120);
		
	}
	@Override
	public String toString() { //public을 해줘야함
		return "Computer";  // toString을 함으로 변수명 출력시 주소값이아닌 이스트링 문자열로 출력됨
	}
	
	
	
	
}
