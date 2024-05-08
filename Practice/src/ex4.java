import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
//		1.문자하나를 입력받아 그 문자의 유니코드를 출력하기
		char a = '가';
		System.out.println((int) a);

//		 2.국어, 영어, 수학 점수를 입력받아 총점 출력
//		 평균출력(소수점 2째자리까지 출력)
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수를 순서대로 적으시오 (예_ 35 45 68)");
		int kor = sc.nextInt();
		int mth = sc.nextInt();
		int eng = sc.nextInt();
		int total = kor + mth + eng;
		double 평균 = (double) total / 3;

		System.out.printf("평균 : %.2f", 평균);

		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'K';

//		 3.1 iNum1 / iNum2의 몫 출력

		System.out.println("\n iNum1/iNum2의 몫 은? : " + (iNum1 / iNum2));

//		 3.2 iNum2 * dNum 한 결과를 변수에 넣고 출력하기
		double b = iNum2 * dNum;
		System.out.println("iNum2 * dNum의 값은? : " + b);

//		 3.3 iNum1의 값이 10.0으로 출력되게 하기
		System.out.println("iNum을 double로 변환 하면? : " + (double) iNum1);

//		 3.4 iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
		double c = (double) (iNum1 / iNum2);
		System.out.printf("%.2f", c);

//		 3.5 iNum / fNum 한 결과 3이 출력되게 하시오
		System.out.println(iNum1 / (int) fNum);

//		 3.6 iNum / fNum 한 결과 소수점 13자리까지 나오게 하시오
		double d = (double) (iNum1 / fNum);
		System.out.printf("%.13f", d);

//		 3.7 ch변수의 유니코드 출력하기
		System.out.println((int) ch);

//		 3.8 ch변수에 1을 더해 L이 출력되게 하시오
		int ch1 = ch + 1;
		System.out.println((char) ch1);

//			 1. 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.

//			   ex.
//			   이름을 입력하세요 : 아무개
//			   성별을 입력하세요(남/여) : 남
//			   나이를 입력하세요 : 20
//			   키를 입력하세요(cm) : 180.5

//			   키 180.5cm인 20살 남자 아무개님 반갑습니다^^

		String name = "김요한";
		char gen = '남';
		int age = 32;
		double 키 = 165.0;

		System.out.printf("키 %.1f인 %d %c %s님 반갑습니다^^ \n", 키, age, gen, name);

//			2. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.

		// ex.
//			   첫 번째 정수 : 23
//			   두 번째 정수 : 7
//
//			   더하기 결과 : 30
//			   빼기 결과 : 16
//			   곱하기 결과 : 161
//			   나누기 몫 결과 : 3
		int ex2 = 5;
		int ex3 = 6;
		int 더하기 = ex2 + ex3;
		int 빼기 = ex2 - ex3;
		int 곱하기 = ex2 * ex3;
		int 나누기 = ex2 / ex3;

		System.out.println("더하기 결과 : " + 더하기 + "\n빼기 결과 : " + 빼기 + "\n곱하기 결과 : " + 곱하기 + "\n나누기 몫 결과 : " + 나누기);

//			3. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
//			   계산 공식 ) 면적 : 가로 * 세로
//				     둘레 : (가로 + 세로) * 2
//
//			   ex.
//			   가로 : 13.5
//			   세로 : 41.7
//
//			   면적 : 562.95
//			   둘레 : 110.4
		System.out.print("순서대로 가로 세로 길이를 입력하시오 (예 15.5 46.2) ");
		double ka = sc.nextDouble();
		double se = sc.nextDouble();

		System.out.println("면적 : " + (ka * se) + "\n면적 : " + ((ka + se) * 2));

//			4. 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
//
//			   ex.
//			   문자열을 입력하세요 : apple
//
//			   첫 번째 문자 : a
//			   두 번째 문자 : p
//			   세 번째 문자 : p
		System.out.print("문자열 apple 입력하세요");
		
		String char1 = sc.next();
		
		System.out.println("첫 번째 문자 : " + char1.charAt(0));
		System.out.println("두 번째 문자 : " + char1.charAt(1));
		System.out.println("세 번째 문자 : " + char1.charAt(2));
	}

}
