import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
//		1. 실습문제
//키보드로 부터 하나의 정수 입력받기
//그 정수가 음수이면 "음수"를 출력, 음수가 아니면 "음수가 아니다"를 출력하기
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하시오 : ");
//		int num1 = sc.nextInt();
//		if (num1 < 0) {
//			System.out.println("음수");
//		} else if (num1 > 0) {
//			System.out.println("양수");
//		}
//2. 실습문제
//키보드로 부터 하나의 정수 입력받기
//그 정수가 음수이면 "음수"를 출력,
//음수가 아닌 경우 중 0이면 "0이다"를 출력, 0이 아니면 "양수"를 출력
//		System.out.print("정수를 입력하시오 : ");
//		int num2 = sc.nextInt();
//		if (num2 < 0) {
//			System.out.println("음수");			
//		}else if (num2 > 0) {
//			System.out.println("양수");
//		}else {
//			System.out.println("0이다");
//		}
		
//3. 실습문제
//키보드로 부터 하나의 정수 입력받기
//그 정수가 짝수이면 "짝수"를 출력,
//짝수가 아니면 "홀수"를 출력
		
//		System.out.println("정수를 입력하시오 : ");
//		int num3 = sc.nextInt();
//		int num4 = num3 % 2;
//		if (num4 == 0) {
//			System.out.println("양수");
//		}else {
//			System.out.println("홀수");
//		}

//4. 실습문제
//모든 사람이 사탕을 골고루 나눠가지려고 한다
//인원 수와 사탕의 개수를 키보드로 입력 받고
//1인다 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하기
		
		//ex.
		//인원수 : 29
		//사탕개수 : 100

		//1인당 사탕 개수 : 3
		//남는 사탕 개수 : 13
		
//		System.out.print("인원수를 적어주세요 : ");
//		int num5 = sc.nextInt();
//		System.out.print("\n사탕수를 적어주세요 : ");
//		int num6 = sc.nextInt();
//		int num7 = num6 / num5;
//		int num8 = num6 % num5;
//		
//		System.out.println("\n\n인당 받을수 있는 사탕 갯수 : "+ num7+"\n남은 사탕갯수 : "+num8);
//		
		



//5. 실습문제
//키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하시오
//이 때, 성별이 'M'이면 남학생, 'M'아 아니면 여학생으로 출력하시오.

//ex.
//이름 : 이준기
//학년(숫자만) : 2
//반(숫자만) : 7
//번호(숫자만) : 3
//성별(M/F) : M
//성적(소수점 둘째 짜리까지) : 97.35

//2학년 7반 3번 이준기 남학생의 성적은 97.35이다.
		
//		System.out.print("이름 : ");
//		String name1 = sc.next();
//		System.out.print("학년(숫자만) : ");
//		int grade = sc.nextInt();
//		System.out.print("반(숫자만) : ");
//		int cls = sc.nextInt();
//		System.out.print("번호(숫자만) : ");
//		int num9 = sc.nextInt();
//		System.out.print("성별(M/F) : ");
//		char gen = sc.next().charAt(0);
//		System.out.print("성적(소수점 둘째 자리까지 : ");
//		double p1 = sc.nextDouble();
//		
//		if (gen == 'M' || gen == 'm') {
//			System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %.2f이다.",grade,cls,num9,name1,p1);
//			
//		}else {
//			System.out.printf("%d학년 %d반 %d번 %s 여학생의 성적은 %.2f이다.",grade,cls,num9,name1,p1);
//		}
//		
		
//		if (gen == 'M' || gen =='m') {
//			String sgen = "남학생";			
//		}else {
//			String sgen = "여학생";
//		}
//		System.out.printf("%d학년 %d반 %d번 %s %s의 %s의 성적은 %.2f이다.",grade,cls,num9,name1,p1);
//		

//6. 실습문제
//나이를 키보드로 입력 받아 13세 이하면 "어린이"를 출력
//13세초과 ~ 19세 이하이면 "청소년" 출력
//19세초과이면 "성인" 출력
//		System.out.println("나이를 입력하시오(숫자만) :  ");
//		int age6 = sc.nextInt();
//		if ( age6 <= 13) {
//			System.out.println("어린이");
//		}else if ( age6 > 19 ) {
//			System.out.println("성인");
//		}
//		else {
//			System.out.println("청소년");
//		}
		
//7. 실습문제
//국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
//세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		//ex.
		//국어 : 60
		//영어 : 80
		//수학 : 40

		//합계 : 180
		//평균 : 60.0
		//합격
		
//		System.out.println("국어 영어 수학 점수를 차례대로 입력하시오(ex_ 75 65 25) : ");
//		int kor7 = sc.nextInt();
//		int eng7 = sc.nextInt();
//		int mth7 = sc.nextInt();
//		int total7 = kor7 + eng7 + mth7 ;
//		double average = (double) (total7/3);
//		if (kor7 >= 40 && eng7 >= 40 && mth7 >= 40 && average >= 60) {
//			System.out.println("합격");
//		}else {
//			System.out.println("불합격");
//		}
		
		


//8. 실습문제
//주민번호를 입력받아 남자인지 여자인지 출력하기
		System.out.println("주민번호를 입력하시오(숫자만) : ");
//		char num8 = sc.next
		
		
		
		
//ex.
//주민번호를 입력하세요(- 포함) : 123456-3123456

//여자
//		
		
		
			
			
		
	}
		
	

}
