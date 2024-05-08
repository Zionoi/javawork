import java.util.Scanner;

public class pr01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하시오 : ");
		int kor = scan.nextInt();
		System.out.println("컴퓨터 점수를 입력하시오 : ");
		int com = scan.nextInt();
		System.out.println("수학 점수를 입력하시오 : ");
		int mth = scan.nextInt();
		int total = kor + com + mth;
		double 평균 = (double) total / 3;
		System.out.println("국어 : " + kor + "\n컴퓨터 : " + com + "\n영어 : " + mth + "\n총점 : " + total + "\n평균 : " + 평균);

		/*----타입변환
		 * 값의 타입을 다른 타입으로 변환하는 것
		 * boolean을 제외한 7개의 기본형은 서로 타입변환 가능
		 * 
		 * 종류
		 * -자동(묵시적)타입 변환 : Promotion (작은것에서 큰것으로 형변환시에는 자동으로) 
		 * byte(1byte)->short(2byte), char(2byte)->int(4byte)->long(8byte)->float(4byte)->double(8byte)
		 * ex)
		 * 1byte  byte b1 = 10; 1byte 
		 * 2byte  short s1 = b1; 1byth
		 * 
		 * -강제(명시적)타입 변환 : Casting
		 *  큰 타입을 작은 타입 단위로 타입 변환
		 *  끝의 한 부분만 작은 타입으로 강제적 변환
		 *  
		 *  작은 크기 타입 = (작은크기타입)큰 크기 타입
		 *  ex
		 *  int = byte로 강제 타입변환
		 * 
		 * int intValue = 103029770;
		 * byte byteValue = (byte)intValue;
		 * 이렇게 바꾸면 값은 10으로 바뀜
		 * 원래 값이 보존되지 않음
		 * 
		 * 연산식에서 자동타입 변환
		 * 연산시 두 피연산자 중 크기가 큰 타입으로 자동 타입 변환
		 * 
		 * int intValue = 10;
		 * double doublevalue = 3.14;
		 * 
		 * double로 자동 타입 변환
		 * double result = intValue + doubleValue;
		 * 
		 * int = int + int
		 * int = short + int
		 * short = short + int 는 4byte인 int가 2byte인 short보다 크므로 연산시 int형으로 자동형변환 고로 오류. 이 연산을 맞게 하려면
		 * short = (short)(short +int)이렇게 강제 형변환을 해야함
		 * 
		 * double = int + double
		 * int = int + double double로 자동 형변환 됨으로 강제 형변환 해야함
		 * int = (int)(int+double) 강제형변환
		 * 
		 * ---------------
		 * 
		 * int 이하의 타입 연산
		 * 
		 * int result = byte1, char2, short2, int4
		 *  연산자 (+-*%/)
		 *  byte, char, short, int
		 *  
		 *  위에서 아래로 연산시 무조건 int형으로 형변환 됨
		 *  ex
		 *  byte b1 = 10;
		 *  byte b2 = 20;
		 *  byte result = b1 + s2 // 오류 식이 int형으로 자동 형변환 됨으로 byte에 들어갈수 없다
		 *  int re = b1 + b2
		 *  
		 *  ---------------
		 *  
		 *  long 타입 연산
		 *  
		 *  long result = long type
		 *  연산자 (+-*%/)
		 *  byte char short int
		 *  위에서 아래로 연산시 무조건 long형으로 형변환 됨
		 * 
		 * ----------------
		 * 
		 * 실수 타입 연산
		 * 
		 *  double result = double type
		 *  연산자 (+-*%/)
		 *  byte char short int float double
		 *  위에서 아래로 연산시 무조건 double형으로 형변환 됨
		 * 
		 * float 연산 : 모두 float일 경우에는 float로 형변환
		 * float result = [float type] 연산자 [float type]
		 * 
		 */

	}

}
