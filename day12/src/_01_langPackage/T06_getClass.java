package _01_langPackage;
class Card2 {
	String kind;
	int num;
	Card2(){ // 기본생성자
		this("Heart", 7); // 아래 생성자를 넘겨받음
	}
	Card2(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	/*	
		// toString 오버라이딩
		@Override
		public String toString() {
			return ""+kind + ", "+ num; // 문자열로 시작하면 뒤쪽은 전부 문자열로 바뀌므로 kind의 변수값인 Heart를 출력할수있다. 그냥 kind를 적으면 "kind 출력됨"
		}
		*/
	
}

public class T06_getClass {

	public static void main(String[] args) {
		// getClass 클래스
		
		Card card1 = new Card("SPADE", 3);
		
		System.out.println(card1);
	
//		Class cardClass1 = card1.getClass();
		System.out.println(card1.getClass());
		
		System.out.println(card1.getClass());
		System.out.println(card1.getClass().getName());
		
	}

}
