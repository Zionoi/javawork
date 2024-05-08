package _02_referenceType;

public class T01_StringClass {

	public static void main(String[] args) {
		// 대입 연산자 == 같은가?, != 같지 않은가?
		// String 클래스의 주요 메소드 
		// char charAt(index) - 문자열에서 해당 위치 (index)에 있는 문자 반환
		// int length() - 문자열의 길이 반환
		// boolean equals(string str) - 문자열의 내용이 같은지 확인
		
		
		String name = "홍길동";
		String hobby = "공부하기";
		System.out.println("주소가 같은가? " + (name == hobby));
		String str1 = "의료용";
		String str2 = "의료용";
		System.out.println("주소가 같은가? "+ (str1 == str2));
		
		String myName = "홍길동";
		System.out.println("주소가 같은가? " + (name == myName)); // String은 객체 주소를 새로 만들지않아서 값이 같으면 변수이름이 달라도 같다고 나옴
		
		String str3 = new String("영상");
		String str4 = new String("영상");
		System.out.println("주소가 같은가? " +(str3 == str4)); // 
		// new 클래스(변수값) 으로 앞에 new가 붙어있으면 무조건 객체주소를 새로 만들어서 값이 같아도 다르다 나옴
		
		System.out.println("값이 같은가 같은가? " +str3.equals(str4)); 
		// 주소를 물어보는 == 대입연산자와는 다르게 equals는 값이 같은지를 물어보는 명령어. 그러므로
		
	}

}
