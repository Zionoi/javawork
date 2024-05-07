package _03_Scanner;

import java.util.Scanner;



public class T02_Ex01 {

	public static void main(String[] args) {
		// 국어, 컴퓨터, 수학 점수를 입력받아 저장하고
		// 총점과 평균을 출력하세요
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하시오 : ");
		int 국어 = scan.nextInt();
		
		
		System.out.print("컴퓨터점수를 입력하시오 : ");
		int 컴퓨터 = scan.nextInt();
		
		
		System.out.print("수학점수를 입력하시오 : ");
		int 수학 = scan.nextInt();
		
		
		int 총점 = 국어+컴퓨터+수학 ;
		double 평균 = 총점/3f;
		
		System.out.println("국어 : "+ 국어);
		System.out.println("컴퓨터 : "+ 컴퓨터);
		System.out.println("수학 : "+ 수학);
		System.out.println("총점 : " + 총점);
		System.out.println("평균 : " + 총점/3f);
		
	//	System.out.println("국어 : "+ 국어+"\n컴퓨터 : "+ 컴퓨터+"\n수학 : "+ 수학 +"\n총점 : " + 총점+"\n평균 : " + 평균);
		

	}

}
