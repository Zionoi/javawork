package _02_repetitive;

import java.util.Scanner;

public class T02_overlap_for {

	public static void main(String[] args) {
		// 중첩 for문
/*		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {//for문안에서 또 for문 사용할땐 i변수를 재사용해서는 안된다 
				System.out.println("i="+i+", j="+j);
			}
			System.out.println();
		}
*/		
		// 이를 이용해 구구단을 만들 수 있다
		/*
			2*1=2
			2*2=4
			...
			2*9=18
			
			3*1=3
			...
			3*9=27
			
		*/
		
/*		for(int dan=2; dan<=9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*"+ i + "=" + (dan*i));
			}
			System.out.println();
		}
*/		
/*		
		//예제) 사용자로 부터 숫자를 입력받아 별 출력
		//ex) 숫자입력 : 5
		 //*
		 //**
		 //***
		 //****
		 //*****
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int num1 = sc.nextInt();
		
		for(int i=1; i<=num1; i++) {
			for(int star=1; star<=i; star++) { 
				System.out.print("*");
			}
			System.out.println();
		}// 바깥 for문은 줄바꿈반복기능, 안쪽 for문은  변수 num1 입력수만큼 별을 찍는 기능 
*/		
		// 구구단 가로로 떨어지게 만들기
		System.out.println(" 2단\t 3단\t 4단\t 5단\t 6단\t 7단\t 8단\t 9단\t");
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");     // 결과값을 정렬 하고싶다면 \t로 정리할수있다
				//System.out.printf("%d*%d=%2d  ",j,i,j*i); // printf의 %2d도 활용 할 수 있다
			}
			System.out.println();
				}
		
	
	
	}

}
