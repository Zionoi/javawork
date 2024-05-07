package _02_variable;

public class T01_var {

	public static void main(String[] args) {
		
		
		// 변수
		/* 기본자료형
		 * 정수 : int
		 * 실수 : double
		 * 참,거짓 : boolean
		 * 문자1개 : char(유니코드 사용)
		 */
		
		/*
		 * 정수 타입 : 
		 * byte(1byte) 
		 * char(2byte) 
		 * short(2byte) 
		 * int(4byte) 
		 * long(8byte)
		 */
		
		// -----정수형----
		
		int num1;
		int num2 = 10;
		
		num1 = 11;
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(num1 + num2);
		System.out.println(num1 * 2 + num2);
		
		int sum = num1 + num2;
		
		System.out.println("num1 + num2 = "+sum);
		
		// 변수를 하나 만들어 sum + 5 를 한 결과를 넣으시오. 그리고 출력하시오
		int p = sum + 5;
		System.out.println(p);
		
		long long01 = 50000000000000000L; 
		// long 변수 선언시 숫자를 그냥 넣으면 int형으로 인식하므로 숫자뒤에 L을 넣어줘야 long으로 인식 할 수있다
		
		
		// ----실수형----
		// float 소숫점 이하 6자리까지 정확
		// double 소숫점 이하 12자리까지 정확
		double doub01 = 0.123456;
		System.out.println(doub01);
		double doub02 = 0.9987;
		System.out.println(doub01+doub02);
		// 기본자료형 8byte 를 float 4byte에 (큰자료형을 작은 자료형에) 넣어서 오류남
		float float01 = 45.123456789f; // float 변수 선언시 6자리가 넘어가면 오류가 뜸. float 변수 값 뒤에 f를 넣어주면 오류가 사라짐.
		System.out.println(float01); // 보통은 실수자료형 사용시 double를 사용함
	}

}
