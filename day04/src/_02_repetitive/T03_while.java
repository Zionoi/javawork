package _02_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		// while도 for문 같은 반복문임
		
		/* while(조건식) { // while을 for문 처럼 이용하려면 증가값같은걸 따로 설정해줘야함
				조건식이 참일 때 수행
			}
	*/
		/*
		for(int i=1; i<=3; i++) {
				System.out.println(i);
		}
			위 for문을 while로 바꾸려면
	*/
/*		
		int i = 1;  	// 초기식
		while(i<=3) {	// 조건
			System.out.println(i); //실행
			i++; 		// 증감식
		}// 이렇게 바꿔줄 수 있다
		//반복횟수가 딱 정해져있으면 for문을 사용
		//while은 정해져있는 횟수가 없이 정해진 조건이 있을경우 사용
	
*/		//예)
/*
		int j = 10;
		while(true) {
			if(j==0)
				break;
			System.out.println(j);
			j--;
		
		}
*/		
/*
		int sum = 0;
		for(int j1=1; j1<=100; j1++) {
			sum+=j1;
		}
			System.out.println("1~100까지의 합 : " + sum);
*/
/*	
		int sum = 0;
		int i1 = 1;	
		while(i1<=100) {
			sum+=i1;
			i1++;
		// 위에 두줄을 줄이면 sum+=i1++; 로도 가능하다
		}System.out.println("1~100까지의 합 : " + sum);
*/			
		
/*		
		int x = 10;
		
		while(x != 0) {//x가 0과 같지 않으면 반복문 시작
			System.out.println(x);
			x--;
		} // 결과는 10부터 1까지 차례대로 출력

		//위에 식을 줄일수 있다
		while(x-- != 0) {
			System.out.println(x);
		}// 이 식은 9부터 0까지 출력됨
*/
		
		// break : 반복문을 빠져 나온다
		
/*		
		// 사용예1
		int count = 0;
		while(true) {
			System.out.println(++count);
			if(count == 5) 
				break;
		}
*/		

		// 사용예2
		Scanner sc = new Scanner(System.in);
/*		
		 while(true){
			System.out.println("멈추려면 'q'를 입력하시오");
			char ch = sc.next().charAt(0);
				if(ch == 'q')
					break;
		}
		System.out.println("프로그램이 종료되었습니다");
*/		
		
		
		//문제1. 사용자로부터 연산할 2숫자와 연산자를 입력받아 그 결과를 출력
		//		연산자에 @을 넣으면 멈추고 그렇지 않으면 계속 입력을 받아 결과를 출력해준다.
		/*
			ex) 연산할 연산자와 2숫자를 입력 : + 4 9 입력
				4+9=13 출력
				연산할 연산자와 2숫자를 입력 : * 4 9 입력
				4*9=36
				연산할 연산자와 2숫자를 입력 : @ 4 9 입력
				프로그램을 종료합니다
		*/
		
	
/*		
 		System.out.println("연산할 연산자와 2숫자를 입력(ex + 8 9. 끝내려면 @ 입력) : ");
			char op = sc.next().charAt(0);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
		switch (op) {
			case('+'):
				System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
			case('-'):
				System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
			case('@'):
				System.out.println("프로그램을 종료합니다"); 
			}
*/				
			
		while(true) {
			System.out.println("연산할 연산자와 2숫자를 입력(ex + 8 9. 끝내려면 @ 입력) : ");
			char op = sc.next().charAt(0);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(op=='@') {
			System.out.println("프로그램이 종료됩니다");
			break;
			}
			else if (op == '+') {
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			continue;
			
		}	else if (op == '-') {
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			continue;
			
		 }	break;
		}
		

	}
}
