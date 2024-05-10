package _02_repetitive;

import java.util.Iterator;

public class T01_for {

	public static void main(String[] args) {
		//반복문
		/*
		  반복문 3가지 : for, while, do-while
		  
		  반복문은 특정한 규칙이 있는 것들을 반복하여 사용할 때
		*/

	/*
		for (초기화; 조건식; 증감식) {
				실행할 실행문
		}
	*/
/*		
		// 가정 - 안녕하세요를 열번 쓰고싶다
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		//열번적어야한다 비효율적
*/	
		
/*		
		for(int i=1; i<=10; i++) {// 변수 i가 10과 작거나 같을때까지 1씩 증가시키면서 반복한다는 뜻
			System.out.println("안녕하세요"); //for문도 실행문이 한줄일땐 {}중괄호 필요없음
		}
		//스텍에 for문이 올라옴 i라는 저장공간을 만든후 1을 넣어줌.
		// 조건식이 참이면 반복 i++ 연산으로 변수값1증가
		// 변수값이 거짓이 되면 반복하지않고 괄호를 빠져나옴
		// 빠져나오면 스텍에 for문과 저장공간 i는 사라짐
		// 괄호 나온후에는 i값을 출력하려해도 할 수 없음
		// 괄호 밖에서 i값을 출력하고 싶을경우 for 전에 i 변수를 먼저 선언하면 반복문이 끝나도 i가 소멸하지 않는다
*/		
		
/*		
		// 가정2 - 안녕하세요를 100번 반복하는데 몇 번 반복됐는지 알고싶다
		
		for(int i=1; i<=100; i++) {
			System.out.println(i + ". 안녕하세요"); // 변수 i는 1씩 증가하고있으므로 문구앞에 변수를 출력함으로써 번호처럼 활용할 수 있다
		}
*/	
/*		
		for(int i=1; i<=9; i+=2){//i를 2씩 증가시킬 수 있다
			System.out.println(i + "번 출력");
		}
*/		
	
/*		
		for(int i=10; i>=1;i--) { //i를 감소시킬 수 도 있다
			System.out.println(i + ". 1씩 감소");
*/
		
		
		// 예제1) 1~100까지의 합계 구하기
/*		
		int sum = 0; // 지역변수는 그 지역에서만 기능
		
		for(int i=1; i<=100; i++) { //i도 지역변수
			sum += i;    // 스텍에 sum과 i 저장공간이 생성된 후 각각 0과 1이 들어있는 상태에서 반복되며 sum의 값이 sum+1로 덮어쓰기됨.
			System.out.println("for문 안 : " + sum);
		}
		System.out.println("1~100까지 합 : " + sum);
*/		
		
/*		
 		가령 sum변수가 for문 안에 있을경우
 		
		for(int i=1; i<=100; i++) {
			int sum = 0; 
			sum += i;    
			System.out.println("for문 안 : " + sum);
		}
		//스텍에 for문이 올라오고 i라는 저장공간이 생겨서 그자리에 1이 들어옴
		//sum 변수가 for문 안에 있으면 반복되면서 sum변수가 다시 초기화 되므로 반복의 의미가 없어진다
		//그러므로 누적되야하는 변수는 for문 밖에서 선언해야한다
		
*/		
		// 3의 배수의 합을 구하는 방법
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%3==0) // 3의 배수만 골라내는 식. if가 참일경우
				sum += i; // i를 sum에 더해준다
		}
			System.out.println("1~10까지 3의 배수의 합 : " + sum); // 값은 18
	
	
	
	}

}
