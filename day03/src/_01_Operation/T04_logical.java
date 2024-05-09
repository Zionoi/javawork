package _01_Operation;

public class T04_logical {

	public static void main(String[] args) {
		// 논리곱과 논리합
		/*  1 : 참 , 0 : 거짓					|(버티컬바)
		 x  y   논리곱(&&): 그리고 and ,   논리합(||) : 또는 or
		 0  0			0					0
		 0  1			0					1
		 1  0			0					1
		 1  1			1					1

		*/

		int num1 = 10;
		int num2 = 20;
		boolean re1 = num1 > num2 && num1 <= num2; // 우선순위는 연산자 먼저 그리고 논리곱 논리합
//				f(0)	  f(0)    &&	  t(1)
		
		System.out.println(re1); // false
		
		re1 = num1 > num2 || num1 <= num2;
		System.out.println(re1); //true
		
		System.out.println("----------------");
		
		// ! : not
		re1 = !re1;
		System.out.println(re1); //false
		boolean b1 = false;
		System.out.println(!b1); //true
		
		//사용 예
		char ch = 'K'; // K의 유니코드는 75
		System.out.println(ch);
		System.out.println("소문자 인가? " + (ch >= 'a' && ch <='z')); // 유니코드 소문자영어는 a 97부터 z 122까지
		System.out.println("대문자 인가? "+ (ch >= 'A' && ch <='Z')); // 유니코드 대문자영어는 A 65부터 Z 90까지
	
		
/*
	 
	 
	 
	 
*/
	
	}

}
