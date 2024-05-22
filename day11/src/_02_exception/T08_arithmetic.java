package _02_exception;

import java.util.Scanner;

public class T08_arithmetic {

	public static void main(String[] args) {
		// 0으로 나눌때 나오는 오류
		/*	
			사용자로부터 2수를 입력받아
			나눈 몫 출력
			나눈 나머지 출력
		*/
	
		Scanner sc = new Scanner(System.in);
		System.out.println("나누기할 2개의 정수를 입력 하시오");
		int div = 0;
		int per = 0;
		
		while(true) {
		try {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		div = num1/num2;
		per = num1%num2;
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다 다시 입력하세요");
			continue;
		}
		if(true) {
		System.out.println("두 정수를 나눈후 몫 : "+div);
		System.out.println("두 정수를 나눈후 나머지 : "+per);
		}break;
		
		}
		
	
	}
}
