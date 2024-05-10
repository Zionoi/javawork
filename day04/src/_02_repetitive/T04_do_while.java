package _02_repetitive;

import java.util.Scanner;

public class T04_do_while {

	public static void main(String[] args) {
		// do while
/*		- 조건을 나중에 확인하므로 조건과 상관없이 1번은 반드시 실행, 그냥 while문은 조건이 거짓이면 한번도 실행 안됨.
		do {
			실행문
		}while(조건식)
*/		
		
		boolean b1 = false;
		while(b1) {
			System.out.println("whil 조건문"); // b1은 거짓이므로 실행하지 않는다
		}
		//
		do {
			System.out.println("do-while 조건문"); // do-while 조건문은 한번은 실행한후 뒤에 조건을 확인후 참이면 반복 거짓이면 반복문 탈출
		} while(b1);
	
		
		// 설명을 써준후 사용자가 원하는걸 선택할수 있도록 코딩 만들어보기
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("1. for문 설명, 2. while문 설명, 3. do-while문 설명, 0. 끝내기");
			num = sc.nextInt(); // 밑에 while문에서도 변수 사용하기위해 바깥에서 먼저 변수생성후 덮어쓰기한다 (변수앞에 자료형 쓰면 안됨)
			switch(num) {
			case 1:
				System.out.println("for문은 조건의 횟수가 정해져 있을 때 사용하면 좋음");
				break;
			case 2:
				System.out.println("while문은 특정 조건에 도달했을 때 break를 이용하여 끝낼때 사용하면 좋음");
				break;
			case 3:
				System.out.println("do-while문은 조건을 나중에 확인하므로 무조건 한번은 1번은 실행"); 
			
			}
		}while(num!=0); // do문 안에 num변수를 넣어두면 지역변수라 while문에서 변수사용할 수 없음.
						// ==으로 사용하면 0과 같을때 참이되므로 반복문실행됨 거짓일때 반복을 종료하므로 0과 같지 않을때 반복문을 빠져 나올수 있음 != 사용
		System.out.println("프로그램 종료");	
		
		
		
		
		
		

	}

}
