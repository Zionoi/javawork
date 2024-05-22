package _02_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T11_Exception {

	public static void main(String[] args) {
			// catch문이 여러개
		try {
			int[] num = new int[3];
			Scanner sc = new Scanner(System.in);
			System.out.println("3개의 정수 입력 : ");
			int sum = 0;
			for(int i=0;i<num.length;i++) {
				System.out.println(i+1+"번째 정수 입력");
				num[i]= sc.nextInt();
				sum += num[i];
			}
			num[3] = 5;
			System.out.println("합계 : "+ sum);
			// Exception은 모든 예외클래스의 최상위 클래스
			// 모든 예외를 다 받을 수 있다
		} catch (Exception e) { // 위에 익셉션 잘모르겠다면 그냥 이거하나만 써도 된다. 가장 상위 익셉션이라 다형성때처럼 모든 예외 캐치함 
			System.out.println("예외발생");
			e.printStackTrace(); // 스텍에 들어있는거 몽땅 다 출력
			System.out.println("println : "+e); // 무슨 익셉션이 나왔는지만 출력
		}
	
		
		/*
			Exception을 쓸때 주의점
			multiCatch 사용할때 Exception을 제일 상위에 두면 아래 배치된 catch는 사용 할 수 가없게 되어 오류뜸. 무조건 맨마지막에 배치하기
		
		*/
	}
		

}
