package _01_casting;

public class T02_casting {

	public static void main(String[] args) {
		//casting 캐스팅 강제 형변환 큿 숫자를 작은 숫자로 형변환
		
		
		
		System.out.println("byte 크기 : " + Byte.MIN_VALUE+ " ~ "+ Byte.MAX_VALUE); // 대문자로 되어있으면 상수. 변경할수 없는값
		System.out.println("short 크기 : " + Short.MIN_VALUE+ " ~ "+ Short.MAX_VALUE);
		System.out.println("int 크기 : " + Integer.MIN_VALUE+ " ~ "+ Integer.MAX_VALUE);
		System.out.println("char 크기 : " + Character.MIN_VALUE+ " ~ "+ Character.MAX_VALUE); // Character.MIN_VALUE는 자료형char이므로 출력시 유니코드의 null이 출력됨. 아무것도 안보임
		System.out.println("char 크기 : " + (int)Character.MIN_VALUE+ " ~ "+ (int)Character.MAX_VALUE);// 그러므로 범위값을 보고싶다면 int형으로 강제형변환 해줘야함
		System.out.println("---------------------");
		
		
		int num1  = 123456;
		byte b1 = (byte)num1;
		System.out.println(b1);
		
		
		long long1 = 11111111111123456L;
		float float1 = long1; // 롱에서 플롯으로 형변환 가능하다 실수는 지수부 가수부 구분해서 표현하기때문에 롱형보다 크다
		System.out.println(float1);
		
		
		
		int num2 = 50896; 
		char ch1 = (char)num2; // 유니코드
		System.out.println(ch1);
	}

}
