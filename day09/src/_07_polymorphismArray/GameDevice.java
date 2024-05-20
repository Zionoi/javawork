package _07_polymorphismArray;

public class GameDevice extends Product {

	GameDevice() {
		super(80);
		
	}
	@Override
	public String toString() {//public을 해줘야함 
		return "GameDevice";// toString을 함으로 변수명 출력시 주소값이아닌 이스트링 문자열로 출력됨
	} // toString 상위클래스 Object에 있는 toString을 하위클래스에 오버라이딩
	// 시켜서 리턴값을 바꿔준것. 그래서 주소가 출력안되고 바꾼 리턴값이 출력됨.
	
	
	
	
}
