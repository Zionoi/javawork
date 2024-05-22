package _04_UserExceptionEx;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		/* 사용자로부터 2개의 숫자 입력(1~100)
		 정수1 : 15
		 정수2 : 5
		 
		 15는 5의 배수인가? true
		 
		 정수1 : 14
		 정수2 : 5
		 
		 14는 5의 배수인가? false
		 
		 사용자정의 exception을 만들어서
		 1~100사이의 숫자가 아니면
		 
		 1~100사이 숫자가 아닙니다
		
		*/
		InputNum_api i = new InputNum_api();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2개의 정수를 입력하시오 : ");
		while(true) {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
		i.InputNum(num1, num2);
		break;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.print("정수 2개를 다시 입력하시오 : ");
		}

	}
	}
}
