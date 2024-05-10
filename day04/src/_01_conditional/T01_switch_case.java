package _01_conditional;

import java.util.Scanner;

public class T01_switch_case {

	public static void main(String[] args) {
/*		// switch-case : 케이스에 따라 대응을 하는 명령문 , if문은 범위를 지정할 수 있다면 switch-case는 딱 하나의 경우를 지정한다.
		int num1 = 1; // 가정 - 1~2만 들어있는 변수
		
		//()소괄호안에 숫자대신 변수를 넣어줘도 된다
		switch(num1) {
		case 1:  //;세미콜론이 아니라 : 콜론을 써야한다
			System.out.println("1입니다");
			break; // case 후에는 꼭 break로 괄호 밖으로 빠져나와야 한다.
		
		case 2:
			System.out.println("2입니다"); // 맨 끝 case에는 break를 안써도 괄호 밖으로 나온다. break 써도되고 안써도 된다.
		
		}
*/
		Scanner sc = new Scanner(System.in);
/*		System.out.println("숫자 입력(0~2 숫자만) : ");  // 숫자 입력범위를 정해줘도 잘못 입력하는경우는
		int num2 = sc.nextInt();
		
		switch(num2) {
		case 0:
			System.out.println("0입력함");
			break;
		case 1:
			System.out.println("1입력함");
			break;
		case 2:
			System.out.println("2입력함");
			break;
		default : 
			System.out.println("잘못입력"); // default : 나머지 모두 다 지정해서 설정할 수 있다
		}
*/		
/*		
		char ch = 'k'; // 가정 - 변수에는 k, l, p 만 들어온다.
		switch(ch) {
		// char한문자일땐 ''처리 해주기 String은 ""쌍따옴표 헷갈리지 말기
		case 'k':
		System.out.println("김씨입니다");
			break;
		case 'l':
			System.out.println("이씨입니다");
			break;
		case 'p':
			System.out.println("박씨입니다");
			break;
		default :
			System.out.println("성이 김, 이, 박씨가 아닙니다");
		}
*/		
/*		
		//경우2 break가 없으면 실행된 변수케이스부터 아래까지 한번에 전부 실행된다. 
		char ch = 'k'; 
		switch(ch) {
		
		case 'k':
		System.out.println("김씨입니다");
		
		case 'l':
			System.out.println("이씨입니다");
		
		case 'p':
			System.out.println("박씨입니다");
		
		default :
			System.out.println("성이 김, 이, 박씨가 아닙니다");
		}
*/		
		// break를 없는경우를 이용할 수 도 있다
/*		
		//가정 -  계절을 구하는 코드
		int month = 6;  // 몇월인지 명시하는 변수
		
		switch (month) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;	
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6, 7, 8:   // , 로 케이스를 묶을 수 도 있다
			System.out.println("여름");
			break;
		default :
			System.out.println("가을입니다");
		}
*/		
		// 문1. 사용자로부터 2수와 연산자를 입력받아 연산결과를 출력하시오
		//ex1) 3 + 1 
		//ex2) 첫번째 숫자입력 : 3 -> 두번째 숫자입력 : 1 -> 연산자 입력 : + (+,-,*,/,%)
		
		System.out.println("숫자를 입력하시오 : ");
		int num4 = sc.nextInt();
		System.out.println("연산자를 입력하시오(+,-,*,/,%) : ");
		String p = sc.next();
		//char p = sc.next().charAt(0)  // char로 변수를 받을때는'' 아래 케이스 변수를 ''로 감싸줘야한다 ex) case '+':
 		System.out.println("숫자를 입력하시오 : ");
		int num5 = sc.nextInt();
		
		switch (p) {
			case "+":
				System.out.println(num4+"+"+num5+"="+(num4+num5) );
				break;
			case "-":
				System.out.println(num4+ "-"+num5+"="+(num4-num5) );
				break;
			case "*":
				System.out.println(num4+ "*"+num5+"="+(num4*num5) );
				break;
			case "/":
			  //System.out.println(num4+ "/"+num5+"="+((double)num4/num5) ); // int형으로 나누면 몫만나오니 double형으로 강제형변환 해주기
				System.out.printf("%d%s%d=%.2f\n", num4,p,num5,(double)num4/num5); // printf으로 출력하면 %.2명령어로 double로 출력되는 소숫점 아래자리수를 조절 할 수있다
				break;
			case "%":
				System.out.println(num4+ "%"+num5+"="+(num4%num5) );
				break;	
			default:
				System.out.println("잘못 입력하셨습니다"); 
		}
		
		
		
		
		
		
	}
}
