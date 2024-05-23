package _01_langPackage;

class Card {
	String kind;
	int num;
	Card(){ // 기본생성자
		this("Heart", 7); // 아래 생성자를 넘겨받음
	}
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	// toString 오버라이딩
	@Override
	public String toString() {
		return ""+kind + ", "+ num; // 문자열로 시작하면 뒤쪽은 전부 문자열로 바뀌므로 kind의 변수값인 Heart를 출력할수있다. 그냥 kind를 적으면 "kind 출력됨"
	}
	
	
}





public class T03_toString {

	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card("SPADE", 10);
		Card card3 = null; //주소가아닌 null이 들어가있음
		
		System.out.println(card1);
		System.out.println(card1.toString());
		System.out.println("-----------------------------");
		System.out.println(card2);
		System.out.println(card2.toString());
		
		// 두개다 같은게 출력됨.
		// 객체를 넣은 변수를 출력하면 기본적으로 toString이 호출됨.
		// Object클래스의 toString()은 패키지명. 클래스명@해시코드(16진수로) 형태로 출력됨.
		
		// toString을 오버라이딩하게되면 객체가 들어있는 변수명 출력시 설정한 리턴값이 출력됨
		
		System.out.println("-----------------------------");
		
		//객체를 넣은 변수의 값이 null일때는 null을 출력해줌(toString() 호출안함)
		System.out.println(card3);// 객체주소가아닌 null이 들어있으므로 변수명출력시 null이 출력됨
		// toString으로 출력시 오류
		
		
		

		
		
	}

}
