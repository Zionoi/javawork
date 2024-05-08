package _01_casting;


import java.util.Scanner;

public class T05_ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		 1. 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.

//		   ex.
//		   이름을 입력하세요 : 아무개
//		   성별을 입력하세요(남/여) : 남
//		   나이를 입력하세요 : 20
//		   키를 입력하세요(cm) : 180.5

//		   키 180.5cm인 20살 남자 아무개님 반갑습니다^^

//	String name = "김요한";
//	char gen = '남';
//	int age = 32;
//	double 키 = 165.0;
//

//		System.out.println("이름 입력 : ");
//		String name = sc.next();
//		System.out.println("성별 입력(남/여) : ");
//		String gen = sc.next();
//		System.out.println("나이 입력 : ");
//		int age = sc.nextInt();
//		System.out.println("키 입력(cm) : ");
//		double 키 = sc.nextDouble();
//		System.out.println("키 " + 키 + "cm인 " + age +"살 " + gen+ "자 "+ name + "님 반갑습니다^^");
//		System.out.printf("키 %.2fcm인 %d살 %s자 %s님 반갑습니다^^ \n", 키, age, gen, name);
		
		
//		2. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.

	// ex.
//		   첫 번째 정수 : 23
//		   두 번째 정수 : 7
//
//		   더하기 결과 : 30
//		   빼기 결과 : 16
//		   곱하기 결과 : 161
//		   나누기 몫 결과 : 3
//	System.out.println("첫번째 정수 : ");
//	int ex2 = sc.nextInt();
//	System.out.println("두번째 정수 : ");
//	int ex3 = sc.nextInt();
//	
//	int 더하기 = ex2 + ex3;
//	int 빼기 = ex2 - ex3;
//	int 곱하기 = ex2 * ex3;
//	int 나누기 = ex2 / ex3;
//
//	System.out.println("더하기 결과 : " + 더하기 + "\n빼기 결과 : " + 빼기 + "\n곱하기 결과 : " + 곱하기 + "\n나누기 몫 결과 : " + 나누기+"\n");

//		3. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
//		   계산 공식 ) 면적 : 가로 * 세로
//			     둘레 : (가로 + 세로) * 2
//
//		   ex.
//		   가로 : 13.5
//		   세로 : 41.7
//
//		   면적 : 562.95
//		   둘레 : 110.4
//	System.out.print("순서대로 가로 세로 길이를 입력하시오 (예 15.5 46.2) ");
//	double width = sc.nextDouble();
//	double height = sc.nextDouble();
//	double area = width * height;
//	double cir = width + height * 2;
//	System.out.println("면적 : "+ area + "\n둘레 : " + cir + "\n" );

//		4. 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
//
//		   ex.
//		   문자열을 입력하세요 : apple
//
//		   첫 번째 문자 : a
//		   두 번째 문자 : p
//		   세 번째 문자 : p
	System.out.print("문자열 입력 : ");

	String char1 = sc.next();

	System.out.println("첫 번째 문자 : " + char1.charAt(0));
	System.out.println("두 번째 문자 : " + char1.charAt(1));
	System.out.println("세 번째 문자 : " + char1.charAt(2));
	
	
	

	}

	

}
