package _01_Operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		// 삼항 연산자
		
		int num1 = 10;
		int num2 = 7;
		 // 삼항연산자 : 조건식 ? 조건이 참일때 실행 : 조건이 거짓일때 실행
		
		String re = num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다";
		System.out.println(re);
		
		// 숫자를 무조건 양수로 출력하도록 만드시오
		int num3 = -8;
		int num4 = num3>0 ? num3 : -num3;
		System.out.println(num4);
		
		// 사용자로부터 점수를 입력받아서 80점 이상이면 합격, 그렇지 않으면 불합격을 출력해보시오
		Scanner scan = new Scanner(System.in);
//		System.out.print("점수를 입력하시오(숫자만) : ");
//		int p1 = scan.nextInt();
//		String re1 = p1 >= 80 ? "합격" : "불합격";
//		System.out.println("결과 : "+re1);
		
		System.out.print("점수를 입력하시오(숫자만) : ");
		int p = scan.nextInt();
		String re3 = 
				p >= 90 ? "A" :
					p >= 80 ? "B" :
						p >= 70 ? "C" :
							p >= 60 ? "D" : "F"; // 여러번 중첩시킬수도있다 
		System.out.println(re3);
	}

}
