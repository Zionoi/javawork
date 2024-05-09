package _02_conditional;

import java.util.Scanner;

public class T01_if {

	public static void main(String[] args) {
	/* 	
	 	if(조건식)
	 	if - else
	 	swich-case
	  
		조건문 - 삼항 연산자는 여러조건이 있을때는 사용하기 어렵다 그럴땐 조건문을 사용한다
		조건문 형식
		if(조건식){
		  조건이 참일때 실행할 프로그램
		}
	*/
	/*
		int num1 = 100;
		// if문의 실행할 코드가 한줄일때는 중괄호 {}를 안넣어도되고 넣어도 됨
		if(num1 == 100) 
			System.out.println("100점입니다.");
		// if문의 실행 코드가 두줄 이상일땐 반드시 {}중괄호로 묶어준다
		if(num1 == 100) {
			System.out.println("100점입니다.");
		    System.out.println("안녕.");
		}
		
		int num2 = 95;
		if(num1 < num2) 
			System.out.println(num1 + "dms" + num2 + "보다 작다");
			System.out.println("if의 조건과 상관없이 실행");
		// 사람이보기엔 헷갈릴수 있으므로 보통은 한줄이여도 중괄호로 묶어준다
	*/
			
			
			// 사용자로 부터 점수를 입력받아 80점 이상이면 합격입니다. 축하합니다. 따로 출력하기
			Scanner sc = new Scanner(System.in);
			
			System.out.print("점수를 입력하시오 : ");
			int nu1 = sc.nextInt();
			if(nu1 >= 80) {
				System.out.println("합격입니다");
				System.out.println("축하합니다");
			}
	
	}

}
