package day01;

public class T01_print {

	public static void main(String[] args) {
		// 주석 : 실행하지 않음(컴파일x)
		// 한줄 주석 설명이나 기타 사항들을 적는다

		/*
		 * 여러줄 주석 여러줄에 걸쳐 설명이나 
		 * 특이사항들을 적을 때 사용
		 */

//		 기본 출력문 println -> 출력후 줄바꿈. System.out.println -> 메소드라고함
//		 한글자 이상(문자열) 출력 할 땐 ("") 쌍따옴표를 넣어준다
		System.out.println("더조은 컴퓨터 학원");
		System.out.println("이름 : 김요한");
		
		// 숫자 출력시 쌍따옴표 없이 입력
		System.out.println(3+7);
		System.out.println(5/3);// 정수나눗셈시 몫만 출력됨 나머지는 소멸
		System.out.println(5*3);// 곱하기
		
		// + 기호은 숫자였을 때는 연산을 하고
		//   문자열 이었을 때는 문자들을 연결해줌
		System.out.println(5+3+"문자열 연결"); //숫자와 문자를 같이 출력시 + 로 구분
		System.out.println("강의실 : " + "801");
		System.out.println("강의실 : " + " 801");
		
		// 문자열 뒤에 + 기호가 나오면 그 뒤는 모두 문자로 인식(문자 연결)
		System.out.println("연산결과 : "+ 7+9); // 출력시 앞부분이 문자열일경우 뒤에 +,- 연산시 문자열로 인식됨 
		System.out.println("연산결과 : "+ 5*8); // *,/는 앞에 문자열로 시작해도 정상 연산됨
		
		// 문자열 뒤에 + 기호로 넣어주고 뒤에는 숫자로 인식해주고 싶을 때는 괄호()를 써준다
		System.out.println("연산결과 : " + (5+8)); // 문자열이후 숫자를 연산하고 싶을경우 ()괄호를 해주면 정상 연산됨 
		
		//ln(line) 이 빠지면 줄바꿈 안함
		System.out.print("줄바꿈 안함, ");
		System.out.print("이제 줄바꿈 안됨, ");
		
		System.out.println("줄바꿈 함");
		
		System.out.println("이름 : 김요한");
		System.out.println("특기 : 피아노");
		System.out.println("취미 : 헬스");
		System.out.println("");
		
		// 변수 - 저장공간에 미리 저장하고 필요할때 꺼내쓰는 것
		/* 
		 * - 정수 
		 * byte
		 * char - 한글자, 글자별로 유니코드로 배정되어있음. 유니코드의 번호를 2진수로 변환해 표현. * 연산시 문자열숫자인지 정수인지 확인할것 
		 * short	
		 * int - 기본
		 * long
		 * - 실수
		 * float
		 * double - 기본
		 * - 논리
		 * boolean - 기본
		 */
				
		char a1 = '1';
		System.out.println(a1+1); //char변수는 유니코드를 통해 변환됨. 유니코드에서 1은 49이므로 연산시 49로 연산됨
			
		
		/* 참조형(Reference type)자료형
		 * - 기본형을 제외한 나머지(String, System등) 첫글자는 대문자로 해야함
		 * - 객체의 주소 저장(4byte)
		 */
		
		/* 자료형 변수명;
		 * 자료형 변수명 = 값;
		 * int num;
		 * num = 10;  
		 * -> = 는 오른쪽에 있는 값을 왼쪽에 넣겠다 라는 뜻임 
		 * int num = 10;
		 * 똑같은 변수명은 사용 할 수 없다
		 * 
		 * -변수 명명 규칙-
		 * 대소문자를 구분한다.
		 * 예약어(Reserved word)를 사용해서는 안된다. *예약어 class, public, static, void, int, char... 등등
		 * 숫자로 시작해서는 안된다.(뒤에 붙는건 가능)
		 * 특수문자는 _ 와 $만을 허용한다. (띄어쓰기도 안됨)
		 * 길이 제한이 없다.
		 */
		
		/* -명명규칙 권장사항-
		 * 클래스 이름의 첫 글자는 대문자로 한다
		 * 카멜 표기법 사용
		 *  -맨 첫 글자를 제외한 각 합성어의 첫 글자만 대문자로 표기
		 *  -camelCase(일반 변수), isCamelCase(boolean타입)
		 * 상수의 이름은 대문자로 한다
		 *  - 단어와 단어는 '_'로 구분
		 *  -PI, MAX, MIN_SCORE 
		 */
		
		// https://github.com/professorjiwon/javawork
		// 구글 클래스룸 og4zckb
		// 수업 자료 받는 곳
		
	}

}
