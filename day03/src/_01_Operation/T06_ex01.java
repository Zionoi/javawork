package _01_Operation;

import java.util.Scanner;

public class T06_ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1. 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
//		System.out.print("숫자를 입력하시오 : ");
//		int num1 = sc.nextInt();
//		System.out.println("문제1\n"+(num1 >0 ? "양수" : "양수가 아니다"));
//
//		String result1 = num1 > 0 ? "양수다" : "양수가 아니다";
		
		
		
////		2. 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
////		양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
/*
		System.out.print("숫자를 입력하시오 : ");
		int num2 = sc.nextInt();
//		System.out.println("문제2\n"+(num2 > 0 ? "양수다" : num2 < 0 ? "음수다" : "0이다"));
		String result2 = num2 > 0 ? "양수다" : num2 == 0 ? "0이다" : "음수다";
		System.out.println(result2);
*/
//		3.키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.

		/*
		System.out.print("숫자를 입력하시오 : ");
		int num3 = sc.nextInt();
		int re3 = num3 % 2;
		
		System.out.println("문제3\n"+(re3 == 0 ? "짝수다" : "홀수다"));
		*/
		
//		4. 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 
//		1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
	/*	
		System.out.print("인원수를 적으시오 : ");
		int p4 = sc.nextInt();
		System.out.print("사탕 갯수를 적으시오 : ");
		int p5 = sc.nextInt();
		int p6 = p5 / p4; // 인당 사탕 갯수 구하는 공식
		int p7 = p5 % p4; // 나눠주고 남은 사탕 구하는 공식
		
		System.out.println("문제4\n"+"인당 사탕 갯수는 : "+ p6 + "\n남은 사탕 갯수 : "+p7);
	*/	
		
//
//		5. 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
//		이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
//		 ex.
//		  이름 : 박신우
//		  학년(숫자만) : 3
//		  반(숫자만) : 4
//		  번호(숫자만) : 15
//		  성별(M/F) : F
//		  성적(소수점 아래 둘째자리까지) : 85.75
	/*
		System.out.print("이름을 적으시오 : ");
		String name5 = sc.next();
		System.out.println("학년을 적으시오 : ");
		int grade5 = sc.nextInt();
		System.out.print("반을 적으시오 : ");
		int class5 = sc.nextInt();
		System.out.print("번호를 적으시오 : ");
		int num5 = sc.nextInt();
		System.out.print("성별을 적으시오(M/F) : ");
		char gen5 = sc.next().charAt(0); // Strint ge5 = sc.next(); 로 받았다면 밑에 조건문에서 gen5.equals("M") ? 으로 물어봐야한다
		System.out.print("성적을 적으시오(소수점아래 둘째자리까지) : ");
		double po5 = sc.nextDouble();
//		
//		
		String re5 = gen5 == 'M' || gen5 == 'm' ? 
				name5 + grade5+"학년 " + class5+"반 " + num5 +" 남학생 " + po5+"점" : 
					name5+" " + grade5+"학년 " + class5+"반 " + num5 +" 남학생 " + po5+"점" ;
			System.out.println(re5);
	*/		
	/*		
			System.out.print("이름을 적으시오 : ");
			String name5 = sc.next();
			System.out.println("학년을 적으시오 : ");
			int grade5 = sc.nextInt();
			System.out.print("반을 적으시오 : ");
			int class5 = sc.nextInt();
			System.out.print("번호를 적으시오 : ");
			int num5 = sc.nextInt();
			System.out.print("성별을 적으시오(M/F) : ");
			String ge5 = sc.next(); 
			// String ge5 = sc.next(); 로 받았다면 String은 참조자료형으로 값이 같아도 주소가 다르므로 
			//밑에 조건문에서 값이 같은지 물어보는 gen5.equals("M") ? 으로 물어봐야한다
			System.out.print("성적을 적으시오(소수점아래 둘째자리까지) : ");
			double po5 = sc.nextDouble();
			
			String genre = ge5.equals("M") || ge5.equals("m") ? "남학생" : "여학생";
			System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다",
								grade5,class5,num5,name5,genre,po5);
		*/	
			
		
		
//		6. 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
//		성인(19세 초과)인지 출력하세요.
//			System.out.println("\n나이를 입력하시오 : ");
//			int age = sc.nextInt();
//			String re6 = age <= 13 ? "어린이" : age <= 19 ? "청소년" : "성인";
//			System.out.println(re6);
			
//
//		7. 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 
//		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//		System.out.print("국어 영어 수학 점수를 순서대로 입력하시오 (예 58 62 87) : ");
//		int kor7 = sc.nextInt();
//		int eng7 = sc.nextInt();
//		int mth7 = sc.nextInt();
//		
//		int total = kor7 + eng7 + mth7 ;
//		double average = (double)total/3;
//		
//		String re7 = kor7 >=40 && eng7 >= 40 && mth7 >=40 && average >= 60 ? "합격" : "불합격";
//		System.out.println(re7);
		
//
//		8. 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
//		System.out.println("주민번호를 숫자만 입력하시오 : ");
//		char num8 = sc.next().charAt(6);
//		String re8 = num8 == '1' || num8 == '3' ? "남자" : "여자";
//		System.out.println(re8+num8);
	/*	
		System.out.println("주민번호 입력 (-포함) : ");
		char num8 = sc.next().charAt(7);
		
		String re8 = num8 == '1' || num8 == '3' ? "남자" : "여자";
		System.out.println(re8);
	*/	
		
//		9. 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
//		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
//		아니면 false를 출력하세요.
//		(단, num1은 num2보다 작아야 함)
//		 ex.
//		   정수1 : 4
//		   정수2 : 11
//		   입력 : 13
		
		/*
		System.out.println("숫자를 입력하시오 : " );
		int nu1 = sc.nextInt();
		System.out.println("방금 입력한 숫자보다 큰 숫자를 입력하시오 : " );
		int nu2 = sc.nextInt();
		System.out.println("숫자를 입력하시오 : " );
		int nu3 = sc.nextInt();
		
		boolean re9 = nu3 > nu2 || nu3 <= nu1 ;
		System.out.println(re9);
		*/
//
//		10. 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		System.out.println("3개의 숫자를 입력하시오(공백으로 분리) : ");
		int num10 = sc.nextInt();
		int num11 = sc.nextInt();
		int num12 = sc.nextInt();
		boolean re10 = num10 == num11 && num11 == num12;
		System.out.println("세개의 숫자가 모두 같은가?" + re10);
		
		sc.close();
	}

}
