package _02_wrapperClass;

public class T01_wrapper {

	public static void main(String[] args) {
		// wrapper 기본형을 클래스로 정의한 것. 기본형 값도 객체로 다뤄져야 할 때가 있다.
		// Boolean, Character, Byte, Short, Integer, Long, Float, Double

		// deprecated : 앞으로 없어질 가능성이 있는 것
		Integer iiii = new Integer(3);  // 줄이 그어져있는건 자바에서 사라질 가능성이 있으니 사용하지 마시오 라는 뜻
		Integer i = Integer.valueOf(3); // 메소드를 이용해서 사용해야 함. valueOf는 객체를 생성하지 않고도 사용할수있는 static메소드 이다
		Integer i2 = Integer.valueOf(100);
		
		// .compareTo() : 두개를 비교하시오  
		//					 0 : 비교해서 같으면 0
		//					 1 : 문자열이면 사전순의 반대 (숫자도 같음)
		//					-1 : 문자열의 사전순일 때
		System.out.println(i.compareTo(i2)); // -1

		
		int result = i; // 3
//		result = i.toString()// 오류. toString()의 반환형은 스트링임 int 자료형에 넣을수 없음
		String result2 = i.toString();
		System.out.println("result = "+(result+3)); //6 int형 
		System.out.println("result = "+(result2+3));  //33 String형
		
		
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE); //상수. 변경불가
		System.out.println("Max_VALUE : " + Integer.MAX_VALUE); //상수. 변경불가
		System.out.println("size = "+Integer.SIZE + "bit"); //32bit
		System.out.println("Bytes = "+Integer.BYTES + "bytes"); //4bytes
		System.out.println("type = "+Integer.TYPE); //int
		
		
	}

}
