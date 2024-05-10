import java.util.Scanner;

public class while_for_practice {

	public static void main(String[] args) {
		//for과 while을 통해 1~100까지의 합을 구하시오
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}System.out.println(sum);
		
		
		int sum1 = 0;
		int j = 1;
		while(j<=100) {
			sum1+=j;
			j++;
		}System.out.println(sum1);
		
		
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
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("연산자와 숫자 두개를 입력하시오 끝내려면 연산자 자리에 @를 입력하시오 [ex) + 8 6]");
			char op = sc.next().charAt(0);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(op == '@'){
				System.out.println("프로그램 종료");
				break;
			}else if(op=='+') {
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				continue;
			}else if(op=='-') {
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				continue;
			
			}break;
		}
	}
}
