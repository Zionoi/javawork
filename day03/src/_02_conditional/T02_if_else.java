package _02_conditional;

import java.util.Scanner;

public class T02_if_else {

	public static void main(String[] args) {
		/*
		if(조건식){
			조건이 참일 때 실행 할 프로그램
		} else {
			조건이 거짓일 때 실행할 프로그램
		}
		*/
		/*
		int num1 = -100;
		if(num1 >= 0)
			System.out.println("양수");
		else
			System.out.println("양수가 아니다"); // else도 실행코드가 한 줄 일땐 {}중괄호 안해도 된다.
											 // 한 줄 이상이면 반드시 {}중괄호를 넣어야 한다
		
		*/
		
	/*	
		int score = 68;
		if(score >= 80) {
			System.out.println("축하합니다");
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
			System.out.println("다음 기회에");
		}
	*/
		
		// 사용자로부터 숫자하나를 입력받아 짝수, 홀수 구분
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num1 = scan.nextInt();
		int re1 = num1 % 2;
		if(re1 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
	}
}
