package _02_repetitive;

import java.util.Iterator;
import java.util.Scanner;

public class T06_ex01 {

	public static void main(String[] args) {
		// 주사위의 숫자 맞추기 게임
		
		// com의 숫자는 1~6 들어오게 만들기
		/*		
				Scanner sc = new Scanner(System.in);
				int com = (int)(Math.random()*6)+1;
				System.out.println(com);
				int user; // 변수 미리 선언
				int p=1;
				
				do {
					System.out.println("주사위의 숫자를 맞춰보세요 : ");
					user = sc.nextInt();
					
					if (user == com) {
						System.out.println("맞췄습니다!"+"도전 횟수 "+p+"회");
					}else
						System.out.println("틀렸습니다. 다시 입력하세요");
						p++;
					
				}while(user != com);			
				*/
		
		
		//연습문제 
		
		//1. 1부터 100까지의 정수 중 5의 배수의 합계를 출력하는 프로그램을 작성하시오. 아래 코드에서 반복문을 이용하여 합계 연산을 처리하는 코드를 추가하시오.
		/*		
				int sum1 = 0 ;
				for (int i =1; i<=100; i++) {
					if(i%5==0) 
						
						sum1= sum1 + i;
					
				}System.out.println("1~100까지 5의 배수의 합계는"+sum1);// 1~100까지의 5의 배수의 총합은 1050
				*/
		
		//2. 1부터 100까지의 수 중 짝수와 홀수의 합을 각각 구하시오
		/*		
				int evenSum = 0;
				int oddSum = 0;
				
				
				for (int i=1; i<=100; i++) {
					if(i%2==0)
						evenSum += i;
				 else 
					oddSum += i;
				}
				System.out.println("1~100까지 짝수의 합계는 "+evenSum);
				System.out.println("1~100까지 홀수의 합계는 "+oddSum);
				
				*/
		
		//3. 두 개의 주사위의 두 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
/*		
		for (int x=1; x<=6; x++) {
			for (int y=1; y<=6; y++) {
				if(x+y == 6) {
					System.out.println("("+x+y+")"); 
				}
				}
					*/
				
		//4.이중 for문을 이용하여 아래와 같은 실행 결과가 출력되도록 코드를 작성하시오.
		/*
		 
		 * 
		 **
		 ***
		 ****
		 *****
		 
		 */
		/*		for(int i=1; i<=5; i++) {
					for(int j=1; j<=i; j++) {
						System.out.print("*");
					}System.out.println();
				}
				*/
				
		
		//5. 이중 for문을 이용하여 아래와 같은 실행 결과가 출력되도록 코드를 작성하시오.
	/*	
		*****
		****
		***
		**
		*
	*/	
				
	/*	for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}	
			*/
		
		//6. 이중 for문을 이용하여 아래와 같은 실행 결과가 출력되도록 코드를 작성하시오.
		int sum = 5;
			for(int i=1; i<=sum; i++) {
				
				for (int j=1; j<=sum-i; j++) {
					System.out.print(" ");
				}
					for (int k=1; k<=2*i-1; k++) {
						System.out.print("*");
					}System.out.println();
				}System.out.println();
		
		
//		07. 주사위의 눈이 6이 나올때까지 계속 반복해서 굴리고, 눈이 6이 되면 지금까지 주사위를 굴린 횟수까지 출력하는 코드를 작성하시오
//		(while문으로 반복, 주사위는 Math.random()으로 작성)
		/*		int rollcount = 0;
			
				while(true) {
					int dicecount = (int)(Math.random()*6)+1;
					p++;
					System.out.println(r);
					
				}
				
			System.out.println("주사위 굴린횟수 : "+p);
				*/
		/*		
			 int rollCount = 0; // 주사위를 굴린 횟수 초기화
		
		     while (true) { // while(true) 조건이 참이면 무한히 반복하는 반복문
		 int diceResult = (int) (Math.random() * 6) + 1; // 1부터 6까지의 랜덤한 숫자 생성
		 rollCount++; // 주사위를 굴린 횟수 증가
		 System.out.println(diceResult); // 주사위 결과 출력
		
		 if (diceResult == 6) {
		     break; // 주사위의 눈이 6이 되면 반복문 종료
		 }
		     }
		
		     System.out.println("주사위를 6이 나올 때까지 굴린 횟수: " + rollCount);
			*/	
		/*		
				
		     int rc = 0;
		     
		     while(true) {
		    	 int dc = (int)(Math.random()*6)+1;
		    	 rc++;
		    	 System.out.println(dc);
		    	 if(dc==6)
		    		 break;
		     }
		     
		     System.out.println("주사위 돌린 횟수 : "+rc);
		     
		     
		     
		     
		     
		     */
     
     
     
     
     
		
		
		
		
		
	}
}
