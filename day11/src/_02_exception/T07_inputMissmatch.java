package _02_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T07_inputMissmatch {

	public static void main(String[] args) {
		// 스캐너 입력시 자료형을 다르게 받았을때 오류
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 입력");
		int sum = 0;
		for(int i=1; i<=3;i++) {
			System.out.println(i + "번째 정수 입력 : ");
			try {
			int num = sc.nextInt();
			sum += num;
			} catch(InputMismatchException e) { // 이건 import 해줘야 사용가능
				System.out.println("정수가 아닙니다");
				sc.next();//sc.nextInt()는 다음 엔터까지 입력값을 받으므로 nextsk nextLine으로 한번 엔터를 해줘야 무한반복이 안됨
				i--;
			}
			}
		System.out.println("합계 : " + sum);
		
	}
	
}
