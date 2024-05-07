package _01_print;

public class T02_printf {

	public static void main(String[] args) {
		//printf(%d,5) c언어
				//System.out.format(%d,5)
				/*%b boolean
				 * %d 10진 정수 형식으로 출력
				 * %o 8진 정수 형식으로 출력
				 * %x, %X 16진수 형식으로 출력 (0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,10)
				 * %f 실수형float 형식으로 출력
				 * %c 문자char로 형식으로 출력
				 * %s 문자열String 형식으로 출력
				 */
				
		// 십진수 출력
		System.out.printf("%d\n",3);
		System.out.printf("%d, %d\n",10, 20);
		int num1 = 100;
		int num2 = 200;
		System.out.printf("%d,%d\n", num1, num2);
		
		// 8진수 출력
		System.out.printf("%o\n", 9); // 11
		
		// 16진수 출력
		System.out.printf("%x\n", 13); //d
		System.out.printf("%X\n", 13); //D
		
		// 실수형 출력
		System.out.printf("%f\n", 3.555555555555); // 7번째 자리에서 반올림해서 소숫점 6자리까지만 출력됨 출력값 3.555556
		
		// 문자1개 출력
		System.out.printf("%c\n", 'm'); //char 문자한개는 ''따옴표
		System.out.printf("%s\n", "asdfqwer");// String 문자열은 ""쌍따옴표
		
		// boolean타입 출력
		System.out.printf("%b\n", true);
		System.out.printf("%b\n", 7>3);
		
		// 현재는 2024년 5월 이고, 우리나라의 평균키는 165.7입니다.
		System.out.printf("현재는 %d년 %d월 이고, 우리나라의 평균키는 %f 입니다\n", 2024,5,165.7);
		
		// 이 과정의 정원은 25명이고, 현재25명 수강중 입니다. 평균 100%를 달성했습니다.
		System.out.printf("이 과정의 정원은 %d명이고, 현재%d명 수강중 입니다. 평균 %d%%를 달성했습니다.", 25,25,100);
		
	}

}
