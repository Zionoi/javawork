package _02_conditional;

import java.util.Scanner;

public class T03_multi_if {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = scan.nextInt();
		
		if(score>100 || score <0)
			System.out.println("잘못 입력하셨습니다");
		else if(score >= 90) 
			System.out.println("A학점");
		else if(score >= 80)
			System.out.println("B학점");
		else if(score >= 70)
			System.out.println("C학점");
		else if (score > 60) 
			System.out.println("D학점");
		else
			System.out.println("F학점");
		
	}

}
